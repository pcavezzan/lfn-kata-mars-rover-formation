package com.marsrover.config

import com.marsrover.infrastructure.api.RoverAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun roverAdapter() = RoverAdapter()
}