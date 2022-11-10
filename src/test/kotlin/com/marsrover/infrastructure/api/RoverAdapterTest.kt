package com.marsrover.infrastructure.api

import com.marsrover.domain.application.MoveRoverForward
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class RoverAdapterTest {


    private lateinit var moveRoverForward: MoveRoverForward
    private lateinit var adapter: RoverAdapter

    @Test
    fun `should send command to move rover forward`() {
        //GIVEN

        //WHEN
        adapter.moveRoverForward(emptyArray())

        //THEN
        verify { moveRoverForward.execute() }
    }
}
