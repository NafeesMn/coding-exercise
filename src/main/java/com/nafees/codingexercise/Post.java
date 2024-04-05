package com.nafees.codingexercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Post(Long userId, Long id, String title, String body, int titleLength){} // changing the format of the JSON response by adding 'titleLength' field