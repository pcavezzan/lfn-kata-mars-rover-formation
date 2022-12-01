package com.marsrover.infrastructure.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RoverController(val adapter: RoverAdapter) {

    @PostMapping("/commands")
    fun moveRover(@RequestBody commands: List<String>): ResponseEntity<RoverPositionResponse> {
        return ResponseEntity.ok(adapter.moveRoverForward(commands))
    }

    /*
        rover.executeCommands(commands.toList())
        rover.toRoverPositionResponse()
     */
}
