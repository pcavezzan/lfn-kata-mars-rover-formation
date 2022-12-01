package com.marsrover.infrastructure.api

import com.marsrover.domain.application.MoveRoverForward

class RoverAdapter(val moveRoverForward: MoveRoverForward) {
    fun moveRoverForward(command: Array<String>): RoverPositionResponse =
        RoverPositionResponse.from(moveRoverForward.execute())
}
