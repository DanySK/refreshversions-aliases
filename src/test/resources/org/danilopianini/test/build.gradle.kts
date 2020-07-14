import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.cb372:scalacache-core_2.12:_")
    implementation("com.github.cb372:scalacache-guava_2.12:_")
    implementation("com.github.kittinunf.fuel:fuel-coroutines:_")
    implementation("com.github.kittinunf.fuel:fuel:_")
    implementation("com.graphhopper:graphhopper-core:_")
    implementation("com.graphhopper:graphhopper-reader-osm:_")
    implementation("com.uchuhimo:konf:_")
    implementation("com.uchuhimo:konf-yaml:_")
    implementation("io.github.javaeden.orchid:OrchidCore:_")
    implementation("io.github.javaeden.orchid:OrchidWiki:_")
    implementation("io.kotest:kotest-runner-junit5-jvm:_")
    implementation("io.kotest:kotest-assertions-core-jvm:_")
    implementation("it.unibo.alchemist:alchemist:_")
    implementation("it.unibo.alchemist:alchemist-incarnation-protelis:_")
    implementation("org.antlr:antlr4:_")
    implementation("org.antlr:antlr4-runtime:_")
    implementation("org.apache.ignite:ignite-spark:_")
    implementation("org.apache.ignite:ignite-tools:_")
    implementation("org.junit.jupiter:junit-jupiter:_")
    implementation("org.junit.jupiter:junit-jupiter-api:_")
    implementation("org.protelis:protelis-interpreter:_")
    implementation("org.protelis:protelis:_")
    implementation("org.spekframework.spek2:spek-dsl-jvm:_")
    implementation("org.spekframework.spek2:spek-runner-junit5:_")
}
