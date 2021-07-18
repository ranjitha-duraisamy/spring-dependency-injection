package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyDIControllerTest {

    PropertyDIController propertyDIController;

    @BeforeEach
    void setUp() {
        propertyDIController = new PropertyDIController();
        propertyDIController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyDIController.greetings());
    }

}