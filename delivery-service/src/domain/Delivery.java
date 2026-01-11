package com.northtech.delivery.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("deliveries")
public class Delivery {
    @Id
    private Long id;
    private String orderId;
    private String status;
    private LocalDateTime assignedAt;

    public Delivery() {}

    public Delivery(String orderId, String status, LocalDateTime assignedAt) {
        this.orderId = orderId;
        this.status = status;
        this.assignedAt = assignedAt;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getAssignedAt() { return assignedAt; }
    public void setAssignedAt(LocalDateTime assignedAt) { this.assignedAt = assignedAt; }
}
