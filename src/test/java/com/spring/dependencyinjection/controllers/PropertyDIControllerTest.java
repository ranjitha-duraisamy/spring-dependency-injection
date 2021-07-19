package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.PropertyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyDIControllerTest {

    PropertyDIController propertyDIController;

    @BeforeEach
    void setUp() {
        propertyDIController = new PropertyDIController();
        propertyDIController.greetingService = new PropertyService();
    }

    @Test
    void sayHello() {
        System.out.println(propertyDIController.greetings());
    }

}