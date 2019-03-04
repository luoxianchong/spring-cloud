package com.ing.provider.service.repository;

import com.ing.pojo.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ing on 2019-02-23.
 */
@Repository
public class ItemRepository {

    private ConcurrentHashMap<Long,Item> map=new ConcurrentHashMap<>();

    private AtomicLong codeGen=new AtomicLong(1);

    public Collection<Item> listItems() {
        return map.values();
    }

    public Item saveItem(Item item) {
        if(item!=null) {
            if (item.getCode() == null) {
                item.setCode(codeGen.getAndIncrement());
            }
            map.put(item.getCode(), item);
        }
        return null;
    }
}
