package com.northtech.common.dto;

import java.time.LocalDateTime;

public class EventDto {
    private String type;
    private String payload;
    private LocalDateTime timestamp;

    public EventDto() {}

    public EventDto(String type, String payload, LocalDateTime timestamp) {
        this.type = type;
        this.payload = payload;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getPayload() { return payload; }
    public void setPayload(String payload) { this.payload = payload; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
