package com.activity.munchmonkeys.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table (name = "customer_orders")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    private UUID id;
    private LocalDateTime orderDate;
    private int quantity;
    private double price;

    @ManyToMany
    @JoinTable (name = "order_items",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Order(LocalDateTime orderDate, int quantity, double price) {
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.price = price;
    }
}
