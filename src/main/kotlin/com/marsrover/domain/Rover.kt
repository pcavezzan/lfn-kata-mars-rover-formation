package com.marsrover.domain

data class Rover(var point: Point, val direction: Direction) {

    fun executeCommands(commands: List<String>) {
        when (commands[0]) {
            "f" -> if (Direction.N == direction) point = Point(point.x, point.y + 1)
            else if (Direction.S == direction) point = Point(point.x, point.y - 1)
            else if (Direction.E == direction) point = Point(point.x + 1, point.y)
            else point = Point(point.x - 1, point.y)
        }
    }
}

enum class Direction {
    N,
    W,
    E,
    S
}
