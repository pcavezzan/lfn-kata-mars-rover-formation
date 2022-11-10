package com.marsrover.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class RoverTest {

    @Test
    internal fun `should initialize a rover with a starting point and a direction`() {
        val x = 0
        val y = 0
        val direction = Direction.N

        val rover = Rover(Point(x, y), direction)

        val expectedRover = Rover(Point(x, y), direction)
        assertThat(rover).isEqualTo(expectedRover)
    }

    @ParameterizedTest
    @CsvSource("N,0,1", "S,0,-1", "E,1,0", "W,-1,0")
    internal fun `should move rover forward to given direction`(givenDirection: String, expectedX: Int, expectedY: Int) {
        val x = 0
        val y = 0
        val direction = Direction.valueOf(givenDirection)
        val commands = listOf("f")

        val rover = Rover(Point(x, y), direction)

        rover.executeCommands(commands)

        val expectedRover = Rover(Point(expectedX, expectedY), direction)
        assertThat(rover).isEqualTo(expectedRover)
    }



}
