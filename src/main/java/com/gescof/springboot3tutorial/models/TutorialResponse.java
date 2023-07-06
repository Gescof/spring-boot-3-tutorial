package com.gescof.springboot3tutorial.models;

import java.util.List;

public record TutorialResponse(
        String greet,
        List<String> programmingLanguages,
        Person person
) {
}
