package com.scholarship.scholarshipportal.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.scholarship.scholarshipportal.service.AuthService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestParam String username,
            @RequestParam String password) {
        return authService.register(username, password);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
            @RequestParam String password) {
        return authService.login(username, password);
    }
}