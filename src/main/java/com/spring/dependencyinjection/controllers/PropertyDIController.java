package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyDIController {
    @Autowired
    public GreetingService greetingService;

    public String greetings() {
        return greetingService.sayHello();
    }
}
