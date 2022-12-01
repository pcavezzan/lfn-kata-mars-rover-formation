package com.marsrover.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class CommandTest {

    @ParameterizedTest
    @CsvSource(value = [
        "F,FORWARD"
    ])
    fun `should parse string to command`(
        stringCommand: String,
        domainCommand: Command
    ) {
    }
}