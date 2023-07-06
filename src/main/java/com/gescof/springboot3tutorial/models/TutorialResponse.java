package com.gescof.springboot3tutorial.models;

import lombok.Builder;

import java.util.List;

@Builder
public record TutorialResponse(
        String greet,
        List<String> programmingLanguages,
        Person person
) {
}
