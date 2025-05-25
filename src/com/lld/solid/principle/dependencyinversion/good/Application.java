package com.lld.solid.principle.dependencyinversion.good;

public class Application {
    Database db;
    Application(Database db) {
        this.db = db;
    }

    void start() {
        db.connect();
    }
}
