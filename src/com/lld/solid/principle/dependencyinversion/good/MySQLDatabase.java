package com.lld.solid.principle.dependencyinversion.good;

public class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}
