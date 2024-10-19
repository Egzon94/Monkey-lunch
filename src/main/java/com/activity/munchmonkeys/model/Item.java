package com.activity.munchmonkeys.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

@Entity
@Data
@NoArgsConstructor
@Table (name = "item_list")
public class Item {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;

    private String name;
    private String description;
    private double price;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;


    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
