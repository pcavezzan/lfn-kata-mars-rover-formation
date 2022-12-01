package com.marsrover.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CommandTest {

    @ParameterizedTest
    @CsvSource(value = [
        "F,FORWARD"
    ])
    fun `should parse string to command`(
        stringCommand: String,
        domainCommand: Command
    ) {
        val command = Command.parse(stringCommand)

        assertThat(command).isEqualTo(domainCommand)
    }
}