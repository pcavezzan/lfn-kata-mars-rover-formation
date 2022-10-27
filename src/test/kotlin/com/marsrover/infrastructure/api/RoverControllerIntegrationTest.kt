package com.marsrover.infrastructure.api

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
internal class RoverControllerIntegrationTest {

    @Autowired
    private lateinit var webContext: WebApplicationContext

    private lateinit var mockMvc : MockMvc


    @Test
    internal fun `should post command to rover`() {
        TODO("Not yet implemented")
    }
}
