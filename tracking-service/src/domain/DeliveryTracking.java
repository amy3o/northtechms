package com.northtech.tracking.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("delivery_tracking")
public class DeliveryTracking {
    @Id
    private Long id;
    private String orderId;
    private String status;
    private LocalDateTime lastUpdated;

    public DeliveryTracking() {}

    public DeliveryTracking(String orderId, String status, LocalDateTime lastUpdated) {
        this.orderId = orderId;
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(LocalDateTime lastUpdated) { this.lastUpdated = lastUpdated; }
}
