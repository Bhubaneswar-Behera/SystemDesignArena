package com.lld.solid.principle.dependencyinversion.bad;

public class  MySQLDatabase {
    void connect() {
        System.out.println("Connected to MySQL");
    }
}
