package com.example.gridscircles.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime created_at;

    private String email;

    private Character status;

    @NotNull
    private double total_price;

    public Delivery() {}
}
