package com.gescof.springboot3tutorial.models;

import lombok.Builder;

@Builder
public record Person(
        String name
) {
}
