package com.marsrover.domain

enum class Command(private val value: String) {
    FORWARD("F");

    companion object {
        fun parse(stringCommand: String): Command {
            return Command.values().toList().find { it.value == stringCommand }
                ?: throw IllegalArgumentException("Unknown command")
        }
    }

}