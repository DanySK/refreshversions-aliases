package org.danilopianini

import java.lang.IllegalStateException

/**
 * Utility methods collection, to be exposed to settings.gradle.kts.
 */
object VersionAliases {

    /**
     * The aliases of refreshversions-aliases.
     */
    val additionalAliases: String = Thread
        .currentThread()
        .contextClassLoader
        .getResource("org/danilopianini/version-aliases")
        ?.readText()
        ?: throw IllegalStateException("Unable to find the version aliases")

    /**
     * A single-element list with just the aliases of refreshversions-aliases.
     * Shortcut to simply inject these aliases and nothing else.
     */
    val justAdditionalAliases: List<String> = listOf(additionalAliases)
}
