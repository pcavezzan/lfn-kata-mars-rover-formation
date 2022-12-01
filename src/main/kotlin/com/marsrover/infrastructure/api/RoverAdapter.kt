package com.marsrover.infrastructure.api

import com.marsrover.domain.Command
import com.marsrover.domain.application.MoveRover

class RoverAdapter(val moveRover: MoveRover) {
    fun moveRoverForward(commands: List<String>): RoverPositionResponse =
        RoverPositionResponse.from(moveRover.execute(commands.map {
            Command.parse(it)
        }))
}
