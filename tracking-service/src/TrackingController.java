package com.northtech.tracking.controller;

import com.northtech.tracking.domain.DeliveryTracking;
import com.northtech.tracking.service.TrackingService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    private final TrackingService service;

    public TrackingController(TrackingService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<DeliveryTracking> getAllTracking() {
        return service.getAllTracking();
    }

    @GetMapping("/{orderId}")
    public Mono<DeliveryTracking> getTrackingByOrderId(@PathVariable String orderId) {
        return service.getTrackingByOrderId(orderId);
    }

    @PostMapping
    public Mono<DeliveryTracking> createTracking(@RequestBody DeliveryTracking tracking) {
        return service.saveTracking(tracking);
    }
}
