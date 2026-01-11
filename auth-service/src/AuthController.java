package com.northtech.auth.controller;

import com.northtech.auth.dto.LoginRequest;
import com.northtech.auth.dto.AuthResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Mono<AuthResponse> login(@RequestBody LoginRequest request) {
        // Placeholder logic
        return Mono.just(new AuthResponse("dummy-token", "Login successful"));
    }

    @PostMapping("/register")
    public Mono<AuthResponse> register(@RequestBody LoginRequest request) {
        // Placeholder logic
        return Mono.just(new AuthResponse(null, "User registered"));
    }
}
