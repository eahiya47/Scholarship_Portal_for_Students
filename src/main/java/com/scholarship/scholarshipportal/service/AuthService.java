package com.scholarship.scholarshipportal.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.scholarship.scholarshipportal.entity.User;
import com.scholarship.scholarshipportal.repository.UserRepository;

import com.scholarship.scholarshipportal.config.JwtUtil;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public String register(String username, String password) {

        if (userRepository.findByUsername(username).isPresent()) {
            return "Username already exists";
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole("STUDENT");

        userRepository.save(user);

        return "User registered successfully";
    }

    public String login(String username, String password) {

        var userOptional = userRepository.findByUsername(username);

        if (userOptional.isEmpty()) {
            return "User not found";
        }

        User user = userOptional.get();

        if (passwordEncoder.matches(password, user.getPassword())) {
            return jwtUtil.generateToken(username);
        } else {
            return "Invalid password";
        }
    }
}