package com.lld.design.patterns.creational.singleton;

public class Singleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
    // Step 1: Declare a volatile instance
    private static volatile Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        // private to restrict instantiation
    }

    // Step 3: Public method to return the singleton instance
    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from double-checked Singleton!");
    }
}
