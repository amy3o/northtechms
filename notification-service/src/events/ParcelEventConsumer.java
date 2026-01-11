package com.northtech.notification.events;

import com.northtech.notification.config.RabbitMQConfig;
import com.northtech.notification.dto.NotificationDto;
import com.northtech.notification.service.NotificationService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ParcelEventConsumer {

    private final NotificationService notificationService;

    public ParcelEventConsumer(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RabbitListener(queues = RabbitMQConfig.PARCEL_QUEUE)
    public void handleParcelEvent(String message) {
        // Example: parse JSON message if needed
        NotificationDto dto = new NotificationDto(message, "admin@northtech.com");
        notificationService.sendNotification(dto).subscribe();
    }
}
