package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.PrimaryService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    final PrimaryService primaryService;

    public MyController(PrimaryService primaryService) {
        this.primaryService = primaryService;
    }

    public String printHello() {
        return primaryService.sayHello();
    }
}
