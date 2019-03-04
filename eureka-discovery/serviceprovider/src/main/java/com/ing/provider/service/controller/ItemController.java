package com.ing.provider.service.controller;

import com.ing.pojo.Item;
import com.ing.service.api.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by ing on 2019-02-23.
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/item/all")
    public Collection<Item> findAll(){
        String service=client.getServices().iterator().next();
        System.out.println("service_instance_id:"+client.getInstances(service).iterator().next().getServiceId()+" service:"+service);

        return itemService.findAll();
    }

    @PostMapping("/item/save")
    public Item saveItem(@RequestBody Item item){
       return itemService.saveItem(item);
    }

}
