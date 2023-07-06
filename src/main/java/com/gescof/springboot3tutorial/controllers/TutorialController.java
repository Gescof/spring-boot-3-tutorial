package com.gescof.springboot3tutorial.controllers;

import com.gescof.springboot3tutorial.models.Person;
import com.gescof.springboot3tutorial.models.TutorialResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/tutorial")
public class TutorialController {
    @GetMapping("/greet")
    public TutorialResponse getTutorialResponse() {
        return TutorialResponse.builder()
                .greet("Hello")
                .programmingLanguages(List.of("Java", "Python"))
                .person(Person.builder()
                        .name("Guille")
                        .build())
                .build();
    }
}
