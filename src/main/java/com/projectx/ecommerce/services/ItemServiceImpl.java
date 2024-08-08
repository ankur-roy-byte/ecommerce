package com.projectx.ecommerce.services;

//package com.projectx.ecommerce.services;

import com.projectx.ecommerce.controller.entity.Item;
import com.projectx.ecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItems(String id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}

