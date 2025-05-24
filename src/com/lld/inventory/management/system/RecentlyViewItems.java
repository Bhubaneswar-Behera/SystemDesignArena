package com.lld.inventory.management.system;

import java.util.LinkedList;

public class RecentlyViewItems {
    private LinkedList<Item> items;
    private int MAX_SIZE = 3;

    public RecentlyViewItems() {
        this.items = new LinkedList<>();
    }

    public void addItem(Item item) {
        items.remove(item);
        items.addFirst(item); // Add the new item to the front
        if (items.size() > MAX_SIZE) {
            items.removeLast(); // Remove the oldest item if size exceeds MAX_SIZE
        }
    }

    public LinkedList<Item> getItems() {
        return items;
    }
}
