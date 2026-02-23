package com.servicecenter.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class ServiceBooking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleNumber;
    private String serviceType;
    private String status;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Technician technician;
}
