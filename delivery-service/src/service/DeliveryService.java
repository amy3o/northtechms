package com.northtech.delivery.service;

import com.northtech.delivery.domain.Delivery;
import com.northtech.delivery.repository.DeliveryRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DeliveryService {
    private final DeliveryRepository repository;

    public DeliveryService(DeliveryRepository repository) {
        this.repository = repository;
    }

    public Flux<Delivery> getAllDeliveries() {
        return repository.findAll();
    }

    public Mono<Delivery> getDeliveryByOrderId(String orderId) {
        return repository.findByOrderId(orderId);
    }

    public Mono<Delivery> saveDelivery(Delivery delivery) {
        return repository.save(delivery);
    }
}
