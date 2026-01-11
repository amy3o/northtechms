package com.northtech.auth.service;

import com.northtech.auth.domain.User;
import com.northtech.auth.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Mono<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Mono<User> save(User user) {
        return repository.save(user);
    }
}
