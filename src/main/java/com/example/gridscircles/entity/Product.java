package com.example.gridscircles.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDateTime created_at;

    private String name;

    @NotNull
    private double price;

    @Column(length = 255)
    private String image_url;
}
