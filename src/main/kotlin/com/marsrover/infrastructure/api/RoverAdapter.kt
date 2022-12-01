package com.marsrover.infrastructure.api

import com.marsrover.domain.application.MoveRoverForward

class RoverAdapter(val moveRoverForward: MoveRoverForward) {
    fun moveRoverForward(commands: Array<String>): RoverPositionResponse =
        RoverPositionResponse.from(moveRoverForward.execute(commands))
}
