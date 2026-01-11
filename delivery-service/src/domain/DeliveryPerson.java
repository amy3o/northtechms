package com.northtech.delivery.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("delivery_persons")
public class DeliveryPerson {
    @Id
    private Long id;
    private String name;
    private String vehicle;

    public DeliveryPerson() {}

    public DeliveryPerson(String name, String vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getVehicle() { return vehicle; }
    public void setVehicle(String vehicle) { this.vehicle = vehicle; }
}
