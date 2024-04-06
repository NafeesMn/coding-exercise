package com.nafees.codingexercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// changing the format of the JSON response by adding 'titleLength' field
@JsonIgnoreProperties(ignoreUnknown = true)
public record NewPost(Long userId, Long id, String title, String body, int titleLength){} 