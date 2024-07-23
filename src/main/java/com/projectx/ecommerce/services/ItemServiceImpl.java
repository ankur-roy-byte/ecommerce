package com.projectx.ecommerce.services;

import com.projectx.ecommerce.controller.entity.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    List<Item> list;

    public ItemServiceImpl() {
        list= new ArrayList<>();
        list.add(new Item("1","shampoo","Refurbished shampoo with a good fragrance"));
        list.add(new Item("2","sleeper","This a white color sleeper"));
    }


    @Override
    public List<Item> getItems() {
        return list;
    }

    /**
     * @param Id
     * @return
     */
    @Override
    public Item getItems(String Id) {
         for(Item obj: list)
        {
            System.out.println(obj);
            if(obj.getId().equals(Id)){
                return obj;
            }
        }
        return null;
    }

    @Override
    public Item addItem(Item item) {
        System.out.println(item);
        list.add(item);
        return item;
    }
}
