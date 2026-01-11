package com.northtech.audit.repository;

import com.northtech.audit.domain.AuditLog;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface AuditRepository extends ReactiveMongoRepository<AuditLog, String> {
    Flux<AuditLog> findByService(String service);
}
