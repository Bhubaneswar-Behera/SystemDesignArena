package com.lld.solid.principle.dependencyinversion.bad;

public class Application {
    MySQLDatabase db = new MySQLDatabase();
    void start() {
        db.connect();
    }
}
