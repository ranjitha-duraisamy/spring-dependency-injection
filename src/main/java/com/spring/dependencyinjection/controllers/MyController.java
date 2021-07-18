package com.spring.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String printHello() {
        return "Hello";
    }
}
