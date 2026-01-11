package com.northtech.notification.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String PARCEL_QUEUE = "parcel.queue";

    @Bean
    public Queue parcelQueue() {
        return new Queue(PARCEL_QUEUE, true);
    }
}
