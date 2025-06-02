package com.lld.solid.principle.dependencyinversion.good;

public class MyMongoDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
}
