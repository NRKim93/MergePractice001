package com.example.gridscircles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Builder
public class OrderDetail {
    @Id
    private int id;

    private int order_id;

    private int product_id;

    private int quantity;

    @NotNull
    private double price;

    public OrderDetail() {}
}
