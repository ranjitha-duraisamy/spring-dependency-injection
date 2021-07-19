package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.PropertyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterDIControllerTest {

    SetterDIController setterDIController = new SetterDIController();

    @BeforeEach
    void setUp() {
        setterDIController.setGreetingService(new PropertyService());
    }

    @Test
    void sayHello() {
        System.out.println(setterDIController.getGreetingService().sayHello());
    }

}