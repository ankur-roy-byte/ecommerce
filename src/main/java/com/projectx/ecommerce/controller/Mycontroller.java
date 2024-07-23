package com.projectx.ecommerce.controller;

import java.util.List;


import com.projectx.ecommerce.controller.entity.Item;
import com.projectx.ecommerce.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Mycontroller {

    @Autowired
    private ItemService itemservice;


    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    //get the list of items
    @GetMapping("/items")
    public List<Item> GetItems(){
        return this.itemservice.getItems();
    }

    @GetMapping("/items/{ItemId}")
    public Item getItem(@PathVariable String ItemId)
    {
        return this.itemservice.getItems(ItemId);
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item)
    {
        return this.itemservice.addItem(item);
    }


}
