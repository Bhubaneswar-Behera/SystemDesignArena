package com.lld.design.patterns.behavioural.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("John Doe")
                .setAge("20")
                .setAddress("123 Main St")
                .setBatch("A1")
                .setGrade("A")
                .setPhoneNumber("123-456-7890")
                .build();
    }
}
