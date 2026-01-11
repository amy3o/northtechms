package com.northtech.notification.controller;

import com.northtech.notification.dto.NotificationDto;
import com.northtech.notification.service.NotificationService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/notifications")
public class AdminNotificationController {

    private final NotificationService service;

    public AdminNotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<String> sendNotification(@RequestBody NotificationDto dto) {
        return service.sendNotification(dto);
    }
}
