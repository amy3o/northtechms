package com.northtech.delivery.controller;

import com.northtech.delivery.domain.Delivery;
import com.northtech.delivery.service.DeliveryService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    private final DeliveryService service;

    public DeliveryController(DeliveryService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<Delivery> getAllDeliveries() {
        return service.getAllDeliveries();
    }

    @GetMapping("/{orderId}")
    public Mono<Delivery> getDeliveryByOrderId(@PathVariable String orderId) {
        return service.getDeliveryByOrderId(orderId);
    }

    @PostMapping
    public Mono<Delivery> createDelivery(@RequestBody Delivery delivery) {
        return service.saveDelivery(delivery);
    }
}
