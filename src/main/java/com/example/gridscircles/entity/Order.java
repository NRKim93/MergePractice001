package com.example.gridscircles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Builder
public class Order {
    @Id
    private int id;

    private LocalDateTime order_date;

    private LocalDateTime created_at;

    private String email;

    private String adress;

    private Character status;

    @NotNull
    private double total_price;

    public Order() {}

}
