package com.marsrover.infrastructure.api

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
internal class RoverControllerIntegrationTest {

    @MockkBean
    private lateinit var roverAdapter: RoverAdapter

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    internal fun `should post command to rover `() {
        every { roverAdapter.moveRoverForward(listOf("f")) } returns RoverPositionResponse(0, 1, "E")
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
            """.trimIndent()
                )
            )
    }
}
