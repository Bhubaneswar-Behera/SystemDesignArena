package com.lld.producer.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    //private List<Object> items;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void setItems(ConcurrentLinkedQueue<Object> items) {
        this.items = items;
    }

    public void addItem(Object item){
        items.add(item);
        if (items.size() < 10){
            System.out.println("Produce has added an item to the store : " + item);
        }
    }

    public void removeItem(){
        items.remove(items.size() - 1);
        System.out.println("Consumer has consumed an item from the store : "+ items.size());
    }
}
