import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard:dependencies:+")
}

bootstrapRefreshVersionsAndDependencies(listOf(
//    file("config/version-alias-rules.txt").readText()
))

rootProject.name = "refreshversions-aliases"
