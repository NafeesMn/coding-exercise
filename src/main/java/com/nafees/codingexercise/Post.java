package com.nafees.codingexercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Post(Long userId, Long id, String title, String body){}