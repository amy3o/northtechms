package com.northtech.audit.service;

import com.northtech.audit.domain.AuditLog;
import com.northtech.audit.repository.AuditRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class AuditService {

    private final AuditRepository repository;

    public AuditService(AuditRepository repository) {
        this.repository = repository;
    }

    public Mono<AuditLog> logAction(String service, String action) {
        AuditLog log = new AuditLog(service, action, LocalDateTime.now());
        return repository.save(log);
    }

    public Flux<AuditLog> getServiceLogs(String service) {
        return repository.findByService(service);
    }
}
