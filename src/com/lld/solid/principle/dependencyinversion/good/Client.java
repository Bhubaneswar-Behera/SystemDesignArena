package com.lld.solid.principle.dependencyinversion.good;

public class Client {
    public static void main(String[] args) {
        // Using MySQL Database
        Database mySQLDatabase = new MySQLDatabase();
        Application appWithMySQL = new Application(mySQLDatabase);
        appWithMySQL.start();

        // Using MongoDB
        Database mongoDatabase = new MyMongoDatabase();
        Application appWithMongo = new Application(mongoDatabase);
        appWithMongo.start();
    }
}
