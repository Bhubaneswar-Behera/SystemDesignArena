package com.lld.inventory.management.system;

public class Clothing extends Item{
    private String size;


    public Clothing(String id, String name, double price, int quantity, String size, String color) {
        super(id, name, price, quantity);
        this.size = size;

    }

    public Clothing() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
