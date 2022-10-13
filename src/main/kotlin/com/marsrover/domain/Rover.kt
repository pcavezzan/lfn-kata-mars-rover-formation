package com.marsrover.domain

data class Rover(var point: Point, val direction: Direction) {

    fun executeCommands(commands: List<String>) {
        when (commands[0]) {
            "f" -> point = direction.moveForward(point)
        }
    }
}

enum class Direction( val moveForward: (point: Point) -> Point) {
    N({ point -> Point(point.x, point.y + 1) }),
    W({ point -> Point(point.x - 1, point.y) }),
    E({ point -> Point(point.x + 1, point.y) }),
    S({ point -> Point(point.x, point.y - 1) })
}


