package com.activity.munchmonkeys.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Shop {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String location;

    @OneToMany (mappedBy = "shop")
    private List<Item> items;

    public Shop(String location, String name, List<Item> items) {
        this.location = location;
        this.name = name;
        this.items = items;
    }
}
