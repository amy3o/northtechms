package com.northtech.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("auth-service", r -> r.path("/auth/**")
                        .uri("http://localhost:8081"))
                .route("tracking-service", r -> r.path("/tracking/**")
                        .uri("http://localhost:8082"))
                .route("delivery-service", r -> r.path("/delivery/**")
                        .uri("http://localhost:8083"))
                .route("notification-service", r -> r.path("/notification/**")
                        .uri("http://localhost:8084"))
                .route("analytics-service", r -> r.path("/analytics/**")
                        .uri("http://localhost:8085"))
                .route("audit-service", r -> r.path("/audit/**")
                        .uri("http://localhost:8086"))
                .build();
    }
}
