package com.servicecenter.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class SparePart {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partName;
    private Double price;
    private Integer quantity;
}
