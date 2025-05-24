package com.lld.inventory.management.system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Book("B001", "Effective Java", 45.99, 10, "Joshua Bloch"));
        items.add(new Clothing("C001", "T-Shirt", 19.99, 50, "L", "Blue"));
        items.add(new Electronics("E001", "Smartphone", 699.99, 5, 24));

        System.out.println("Inventory Items:");
        for (Item item : items) {
            System.out.println(item.getName());
        }

        Collections.sort(items);

        System.out.println("\nAfter sorting:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        Collections.sort(items, new ItemQuantityComparator());

        System.out.println("\nAfter sorting based on quantity:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(new Electronics("E001","Mobile",199.99,5,38));
        electronicsInventory.addItem(new Electronics("E002", "Laptop", 999.99, 3, 36));
        electronicsInventory.addItem(new Electronics("E003", "Tablet", 299.99, 10, 12));

        List<Electronics> electronicsItems = electronicsInventory.getAllItems();
        System.out.println("\nElectronics Inventory:");
        for (Electronics electronics : electronicsItems) {
            System.out.println(electronics.getName());
        }

        Item item1 = new Electronics("E004", "Smartwatch", 199.99, 15, 24);
        Item item2 = new Book("B002", "Clean Code", 29.99, 20, "Robert C. Martin");
        Item item3 = new Clothing("C002", "Jeans", 49.99, 30, "M", "Black");
        Item item4 = new Electronics("E005", "Headphones", 89.99, 25, 12);
        Item item5 = new Book("B003", "Design Patterns", 39.99, 15, "Erich Gamma");

        RecentlyViewItems recentlyViewedItems = new RecentlyViewItems();
        recentlyViewedItems.addItem(item1);
        recentlyViewedItems.addItem(item2);
        recentlyViewedItems.addItem(item3);
        recentlyViewedItems.addItem(item4);
        recentlyViewedItems.addItem(item5);
        recentlyViewedItems.addItem(item1); // Adding item1 again to test the recent view functionality

        System.out.println("\nRecently Viewed Items:");
        List<Item> recentlyViewedList = recentlyViewedItems.getItems();
        for (Item item : recentlyViewedList) {
            System.out.println(item.getName() );
        }
    }
}
