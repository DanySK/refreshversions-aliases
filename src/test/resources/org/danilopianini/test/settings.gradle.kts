import de.fayard.refreshVersions.bootstrapRefreshVersions

buildscript {
    repositories { gradlePluginPortal() }
    dependencies {
        classpath("de.fayard.refreshVersions:refreshVersions:+")
        classpath(files("aliases.jar"))
    }
}

bootstrapRefreshVersions(org.danilopianini.VersionAliases.justAdditionalAliases)

rootProject.name = "refreshversions-aliases"
