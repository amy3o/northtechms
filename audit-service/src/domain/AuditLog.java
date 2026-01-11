package com.northtech.audit.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "audit_logs")
public class AuditLog {
    @Id
    private String id;
    private String service;
    private String action;
    private LocalDateTime timestamp;

    public AuditLog() {}

    public AuditLog(String service, String action, LocalDateTime timestamp) {
        this.service = service;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String getId() { return id; }
    public String getService() { return service; }
    public String getAction() { return action; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setId(String id) { this.id = id; }
    public void setService(String service) { this.service = service; }
    public void setAction(String action) { this.action = action; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
