package com.marsrover.infrastructure.api

import com.marsrover.domain.Command
import com.marsrover.domain.application.MoveRoverForward

class RoverAdapter(val moveRoverForward: MoveRoverForward) {
    fun moveRoverForward(commands: List<String>): RoverPositionResponse =
        RoverPositionResponse.from(moveRoverForward.execute(commands.map {
            Command.parse(it)
        }))
}
