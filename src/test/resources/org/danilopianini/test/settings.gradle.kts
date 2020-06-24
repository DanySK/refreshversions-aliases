import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

buildscript {
    repositories { gradlePluginPortal() }
    dependencies {
        classpath("de.fayard:dependencies:+")
        classpath(files("aliases.jar"))
    }
}

bootstrapRefreshVersionsAndDependencies(org.danilopianini.VersionAliases.justAdditionalAliases)

rootProject.name = "refreshversions-aliases"
