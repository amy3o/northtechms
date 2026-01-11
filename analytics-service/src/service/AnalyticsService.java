package com.northtech.analytics.service;

import com.northtech.analytics.dto.MetricsDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class AnalyticsService {

    public Flux<MetricsDto> getRealtimeMetrics() {
        // Example: generate dummy metrics every second
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> new MetricsDto("active_parcels", Math.random() * 100));
    }
}
