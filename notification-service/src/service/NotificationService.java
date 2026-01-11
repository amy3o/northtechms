package com.northtech.notification.service;

import com.northtech.notification.dto.NotificationDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NotificationService {

    public Mono<String> sendNotification(NotificationDto dto) {
        // In real-world, integrate with email/SMS/push service
        System.out.println("Sending notification to " + dto.getRecipient() + ": " + dto.getMessage());
        return Mono.just("Notification sent to " + dto.getRecipient());
    }
}
