package com.activity.munchmonkeys.demo;


import com.activity.munchmonkeys.model.Item;
import com.activity.munchmonkeys.model.Order;
import com.activity.munchmonkeys.repository.ItemRepository;
import com.activity.munchmonkeys.repository.OrderRepository;
import com.activity.munchmonkeys.repository.PersonRepository;
import com.activity.munchmonkeys.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor

public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;
    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;
    private final ShopRepository shopRepository;



    @Override
    public void run(String... args) throws Exception {

        var savedItems = itemRepository.saveAll(List.of(
                new Item("Hamburger", "Very delicious hamburger with ketchum and oninons", 4.99),
                new Item("cheesburger", "same as hamburger but with extra cheese", 5.99)
        ));

        var savedOrder = new Order(
                // something
        );


    }
}
