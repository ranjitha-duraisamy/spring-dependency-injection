package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDIController {

    private final GreetingService greetingService;

    public ConstructorDIController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println(greetingService.sayHello());
    }
}
