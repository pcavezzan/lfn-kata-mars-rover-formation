package com.marsrover.infrastructure.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RoverController(val adapter: RoverAdapter) {

    @PostMapping("/commands")
    fun moveRover(@RequestBody commands: Array<String>): ResponseEntity<RoverPositionResponse> {
        return ResponseEntity.ok(adapter.moveRover(commands))
    }

    /*
        rover.executeCommands(commands.toList())
        rover.toRoverPositionResponse()
     */
}
