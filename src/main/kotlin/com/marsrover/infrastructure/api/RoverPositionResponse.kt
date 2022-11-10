package com.marsrover.infrastructure.api

import com.marsrover.domain.Position

data class RoverPositionResponse(val x: Int, val y: Int, val direction: String) {
    companion object {
        fun from(position: Position): RoverPositionResponse {
            return RoverPositionResponse(position.point.x,position.point.y,position.direction.name)
        }
    }
}
