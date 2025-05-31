package com.lld.design.patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("John Doe")
                .setAge("20")
                .build();
    }
}
