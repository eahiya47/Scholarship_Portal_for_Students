package com.scholarship.scholarshipportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "This is a secured endpoint!";
    }
}