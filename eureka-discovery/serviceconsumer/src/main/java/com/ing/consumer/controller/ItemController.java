package com.ing.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.ing.consumer.service.ItemService;
import com.ing.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

/**
 * Created by ing on 2019-02-23.
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;


    @PostMapping("/item/save")
    public Item saveItem(@RequestBody Item item){
        return itemService.saveItem(item);
    }

    @GetMapping("/item/all")
    @SentinelResource(value = "allItemResource")
    public Collection<Item> findAllItems(){
        return itemService.findAll();
    }

}
