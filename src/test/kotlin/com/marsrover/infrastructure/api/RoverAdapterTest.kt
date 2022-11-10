package com.marsrover.infrastructure.api

import com.marsrover.domain.Direction
import com.marsrover.domain.Point
import com.marsrover.domain.Position
import com.marsrover.domain.application.MoveRoverForward
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class RoverAdapterTest {

    @RelaxedMockK
    private lateinit var moveRoverForward: MoveRoverForward
    @InjectMockKs
    private lateinit var adapter: RoverAdapter

    @Test
    fun `should send command to move rover forward`() {
        every { moveRoverForward.execute() } returns Position(Point(0,0), Direction.N)
        //GIVEN

        //WHEN
        adapter.moveRoverForward(emptyArray())

        //THEN
        verify { moveRoverForward.execute() }
    }
}
