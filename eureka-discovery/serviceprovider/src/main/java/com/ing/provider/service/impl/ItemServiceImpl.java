package com.ing.provider.service.impl;

import com.ing.provider.service.repository.ItemRepository;
import com.ing.pojo.Item;
import com.ing.service.api.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by ing on 2019-02-23.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Collection<Item> findAll() {
        return itemRepository.listItems();
    }
    @Override
    public Item saveItem(Item item) {
        return itemRepository.saveItem(item);
    }


}
