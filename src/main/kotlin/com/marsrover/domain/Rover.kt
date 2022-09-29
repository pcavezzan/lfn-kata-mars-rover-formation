package com.marsrover.domain

data class Rover(var startingPoint: Pair<Int, Int>, val direction: Direction) {

    fun executeCommands(commands: List<String>) {
        when (commands[0]) {
            "f" -> if (Direction.N == direction ) startingPoint = startingPoint.second + 1
        }
    }
}

enum class Direction {
    N,
    W,
    E,
    S
}
