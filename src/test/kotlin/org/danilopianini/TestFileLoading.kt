package org.danilopianini

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldNotBe

class TestFileLoading : StringSpec({
    "version aliases should not be empty" {
        println(additionalAliases)
        justAdditionalAliases shouldNotBe emptyList<String>()
        justAdditionalAliases shouldHaveSize 1
        additionalAliases.length shouldBeGreaterThan 1
    }
})
