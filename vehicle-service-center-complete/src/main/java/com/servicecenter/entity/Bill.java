package com.servicecenter.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double serviceCharge;
    private Double sparePartCost;
    private Double totalAmount;

    @OneToOne
    private ServiceBooking booking;
}
