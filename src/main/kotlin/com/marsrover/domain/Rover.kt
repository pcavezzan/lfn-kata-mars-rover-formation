package com.marsrover.domain

data class Rover(val startingPoint: Pair<Int, Int>, val direction: Direction)

enum class Direction {
    N,
    W,
    E,
    S
}