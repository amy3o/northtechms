package com.northtech.audit.dto;

import java.time.LocalDateTime;

public class AuditLogDto {
    private String service;
    private String action;
    private LocalDateTime timestamp;

    public AuditLogDto() {}

    public AuditLogDto(String service, String action, LocalDateTime timestamp) {
        this.service = service;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
