package com.ing.service.api;

import com.ing.common.ServiceConstants;
import com.ing.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

/**
 * Created by ing on 2019-02-23.
 */
public interface ItemService {

    public Collection<Item> findAll();

    public Item saveItem(Item item);

}
