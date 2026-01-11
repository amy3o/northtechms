package com.northtech.tracking.repository;

import com.northtech.tracking.domain.DeliveryTracking;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface TrackingRepository extends ReactiveCrudRepository<DeliveryTracking, Long> {
    Mono<DeliveryTracking> findByOrderId(String orderId);
}
