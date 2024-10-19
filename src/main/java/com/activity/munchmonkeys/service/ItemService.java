package com.activity.munchmonkeys.service;


import com.activity.munchmonkeys.model.Item;
import com.activity.munchmonkeys.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
