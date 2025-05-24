package com.lld.inventory.management.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String,T> items;

    public Inventory() {
        this.items = new HashMap<>();
    }
    public void addItem(T item) {
            items.put(item.getId(), item);
    }

    public void removeItem(String itemId) {
        items.remove(itemId);
    }
    public T getItem(String itemId) {
        return items.get(itemId);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}
