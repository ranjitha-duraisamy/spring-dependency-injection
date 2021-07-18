package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterDIControllerTest {

    SetterDIController setterDIController = new SetterDIController();

    @BeforeEach
    void setUp() {
        setterDIController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterDIController.getGreetingService().sayHello());
    }

}