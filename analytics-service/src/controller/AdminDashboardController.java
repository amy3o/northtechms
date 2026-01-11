package com.northtech.analytics.controller;

import com.northtech.analytics.dto.MetricsDto;
import com.northtech.analytics.service.AnalyticsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class AdminDashboardController {

    private final AnalyticsService service;

    public AdminDashboardController(AnalyticsService service) {
        this.service = service;
    }

    @GetMapping("/metrics/realtime")
    public Flux<MetricsDto> getRealtimeMetrics() {
        return service.getRealtimeMetrics();
    }
}
