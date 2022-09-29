package com.marsrover.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {
    @Test
    internal fun `should initialize a rover with a starting point and a direction`() {
        val x = 0
        val y = 0
        val direction = Direction.N

        val rover = Rover(Pair(x, y), direction)

        val expectedRover = Rover(Pair(x, y), direction)
        assertThat(rover).isEqualTo(expectedRover)
    }

    @Test
    internal fun `should rover receives commands`() {
        val x = 0
        val y = 0
        val direction = Direction.N
        val commands = listOf("f")

        val rover = Rover(Pair(x, y), direction)

        rover.executeCommands(commands)

        val expectedRover = Rover(Pair(0, 1), direction)
        assertThat(rover).isEqualTo(expectedRover)
    }
}
