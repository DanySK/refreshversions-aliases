package org.danilopianini

import io.github.classgraph.ClassGraph
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe
import org.gradle.internal.impldep.org.junit.rules.TemporaryFolder
import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.TaskOutcome
import java.io.File

class TestAliases : StringSpec({
    val sourceFolder = ClassGraph().enableAllInfo()
        .acceptPackages("org.danilopianini")
        .scan()
        .getResourcesWithLeafName("build.gradle.kts")
        .first()
        .run { File(classpathElementFile.absolutePath + File.separator + path) }
        .parentFile
    val jarFilePath = Thread.currentThread().contextClassLoader.getResource("jarpath")
        ?.readText()
        ?: throw IllegalStateException("Could not find the Jar location file descriptor")
    val testFolder = TemporaryFolder().apply { create() }
    sourceFolder.copyRecursively(testFolder.root)
    File(jarFilePath).copyTo(testFolder.newFile("aliases.jar"), overwrite = true)
    val result = GradleRunner.create()
        .withProjectDir(testFolder.root)
        .withArguments("refreshVersions")
        .build()
    "gradle run should succeed" {
        result.tasks.map { it.outcome }.forEach { it shouldBe TaskOutcome.SUCCESS }
    }
    "all defined aliases should map to a version" {
        val aliases = VersionAliases.additionalAliases.lines()
            .filter { it.contains("^") }
            .size
        val versions = testFolder.root.listFiles()
            ?.find { it.name == "versions.properties" }
            ?.readLines()
            ?.filter { it.startsWith("version.") }
            ?.size
            ?: throw java.lang.IllegalStateException("Could not find a generated versions.properties")
        aliases shouldBeExactly versions
    }
})
