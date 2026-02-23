package com.servicecenter.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
}
