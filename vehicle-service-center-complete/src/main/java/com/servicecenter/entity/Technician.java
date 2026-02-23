package com.servicecenter.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class Technician {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
}
