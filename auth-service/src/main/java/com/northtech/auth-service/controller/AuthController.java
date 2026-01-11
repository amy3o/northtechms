package com.northtech.auth.controller;

import com.northtech.auth.config.JwtUtil;
import com.northtech.auth.domain.Role;
import com.northtech.auth.domain.User;
import com.northtech.auth.domain.UserStatus;
import com.northtech.auth.dto.AuthResponse;
import com.northtech.auth.dto.LoginRequest;
import com.northtech.auth.dto.StaffRegisterRequest;
import com.northtech.auth.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    public AuthController(UserRepository repository, PasswordEncoder encoder, JwtUtil jwtUtil) {
        this.repository = repository;
        this.encoder = encoder;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Mono<AuthResponse> login(@RequestBody LoginRequest request) {
        return repository.findByUsername(request.getUsername())
                .filter(user -> encoder.matches(request.getPassword(), user.getPassword()))
                .map(user -> new AuthResponse(jwtUtil.generateToken(user.getUsername()), user.getUsername()));
    }

    @PostMapping("/register")
    public Mono<User> register(@RequestBody StaffRegisterRequest request) {
        User user = new User(request.getUsername(),
                             encoder.encode(request.getPassword()),
                             Role.STAFF,
                             UserStatus.ACTIVE);
        return repository.save(user);
    }
}
