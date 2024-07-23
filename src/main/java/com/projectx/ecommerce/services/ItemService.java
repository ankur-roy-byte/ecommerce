package com.projectx.ecommerce.services;

import com.projectx.ecommerce.controller.entity.Item;

import java.util.List;

public interface ItemService {
    public List<Item> getItems();

    public Item getItems(String Id);

    public Item addItem(Item item);
}
