package com.marsrover.config

import com.marsrover.domain.application.MoveRover
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CommandConfiguration {

    @Bean
    fun moveRoverForward() = MoveRover()
}
