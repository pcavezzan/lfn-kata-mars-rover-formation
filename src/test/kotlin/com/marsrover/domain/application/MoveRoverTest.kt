package com.marsrover.domain.application

import com.marsrover.domain.Direction
import com.marsrover.domain.Point
import com.marsrover.domain.Rover
import com.marsrover.domain.RoverRepository
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class MoveRoverTest {
    @MockK
    private lateinit var roverRepository: RoverRepository

    @ParameterizedTest
    @CsvSource(value = [
        "N,0,1"
    ])

    fun `should move rover forward from origin`(direction: Direction, x: Int, y: Int) {
        val rover = Rover(Point(x, y), direction)


    }
}