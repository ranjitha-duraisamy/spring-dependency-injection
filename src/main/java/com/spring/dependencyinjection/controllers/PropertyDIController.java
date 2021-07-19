package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyDIController {

    @Qualifier("propertyService")
    @Autowired
    public GreetingService greetingService;

    public String greetings() {
        return greetingService.sayHello();
    }
}
