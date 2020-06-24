package org.danilopianini

import java.lang.IllegalStateException

object VersionAliases {
    val additionalAliases: String = Thread
        .currentThread()
        .contextClassLoader
        .getResource("org/danilopianini/version-aliases")
        ?.readText()
        ?: throw IllegalStateException("Unable to find the version aliases")

    val justAdditionalAliases: List<String> = listOf(additionalAliases)
}
