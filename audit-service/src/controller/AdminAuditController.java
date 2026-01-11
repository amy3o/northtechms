package com.northtech.audit.controller;

import com.northtech.audit.domain.AuditLog;
import com.northtech.audit.service.AuditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class AdminAuditController {

    private final AuditService service;

    public AdminAuditController(AuditService service) {
        this.service = service;
    }

    @GetMapping("/audit/{service}")
    public Flux<AuditLog> getAuditLogs(@PathVariable String service) {
        return service.getServiceLogs(service);
    }
}
