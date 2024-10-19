package com.activity.munchmonkeys.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table (name = "customers")

public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String contactDetails;
    private String deliveryAddress;



    public Person(String name, String contactDetails, String deliveryAddress) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.deliveryAddress = deliveryAddress;
    }


}
