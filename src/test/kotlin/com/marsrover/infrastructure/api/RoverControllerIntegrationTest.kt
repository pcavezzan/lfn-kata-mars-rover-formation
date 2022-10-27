package com.marsrover.infrastructure.api

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MockMvcBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
internal class RoverControllerIntegrationTest {

    @Autowired
    private lateinit var webContext: WebApplicationContext

    @MockBean
    private lateinit var roverAdapter: RoverAdapter

    private lateinit var mockMvc: MockMvc

    @BeforeEach
    internal fun setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build()
    }

    @Test
    internal fun `should post command to rover`() {
        Mockito.`when`(roverAdapter.moveRover(arrayOf("f"))).thenReturn(RoverPositionResponse(0, 1, "E"))
        mockMvc.perform(
            MockMvcRequestBuilders.post("/commands")
                .contentType(MediaType.APPLICATION_JSON).content(
                    """
                ["f"]
            """.trimIndent()
                )
        ).andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(
                MockMvcResultMatchers.content().json(
                    """
                {
                    "x": 0,
                    "y": 1,
                    "direction": "E"
                }
            """.trimIndent()))
    }
}
