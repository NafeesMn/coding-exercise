package com.nafees.codingexercise;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest{

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPosts() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/posts"));
        resultActions.andExpect(status().isOk());
    }
    @Test
    public void testGetLongestTitle() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/longestTitle"));
        resultActions.andExpect(status().isOk());
    }
    @Test
    public void testGetPostsWithLength() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/postsTitleLength"));
        resultActions.andExpect(status().isOk());
    }

}