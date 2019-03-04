package com.ing.consumer.service;

import com.ing.common.ServiceConstants;
import com.ing.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

/**
 * Created by ing on 2019-03-04.
 */
@FeignClient(value= ServiceConstants.PROVIDER)
public interface ItemService {

    @GetMapping("/item/all")
    public Collection<Item> findAll();

    @PostMapping("/item/save")
    public Item saveItem(@RequestBody Item item);
}
