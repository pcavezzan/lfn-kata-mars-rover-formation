package com.marsrover.domain

data class Rover(var point: Point, val direction: Direction) {

    fun executeCommands(commands: List<String>) {
        when (commands[0]) {
            "f" -> if (Direction.N == direction ) point = Point(point.x, point.y + 1)
        }
    }
}


enum class Direction {
    N,
    W,
    E,
    S
}
