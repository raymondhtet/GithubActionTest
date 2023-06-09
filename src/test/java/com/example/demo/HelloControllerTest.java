package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.*;
@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenLoginRequest_AbleToReachApi() throws Exception {
        String expectedWord = "Hello";
        String expectedAnotherWorld = "hello";
        String someMoreExpectedAnotherWorld = "world";
        mockMvc.perform(get("/api/v1/auth/test")).andExpect(status().isNotFound());
        assertEquals(expectedWord, "Hello");
        assertEquals(expectedAnotherWorld, "hello");  
        assertEquals(someMoreExpectedAnotherWorld, "world");
    }
}
