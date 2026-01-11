package com.northtech.tracking.service;

import com.northtech.tracking.domain.DeliveryTracking;
import com.northtech.tracking.repository.TrackingRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TrackingService {
    private final TrackingRepository repository;

    public TrackingService(TrackingRepository repository) {
        this.repository = repository;
    }

    public Flux<DeliveryTracking> getAllTracking() {
        return repository.findAll();
    }

    public Mono<DeliveryTracking> getTrackingByOrderId(String orderId) {
        return repository.findByOrderId(orderId);
    }

    public Mono<DeliveryTracking> saveTracking(DeliveryTracking tracking) {
        return repository.save(tracking);
    }
}
