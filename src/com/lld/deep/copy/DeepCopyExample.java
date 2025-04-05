package com.lld.deep.copy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Copy constructor
    Address(Address other) {
        this.city = other.city;
    }
}

class Person {
    String name;
    Address address;

    // Deep Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address);  // New Address object
    }

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        Address addr = new Address("Delhi");
        Person p1 = new Person("Alice", addr);
        Person p2 = new Person(p1);  // Deep copy
        p2.name = "Bob";
        p2.address.city = "Mumbai"; // Only Bob's address changed

        System.out.println(p1.name + " lives in " + p1.address.city); // Alice lives in Delhi
        System.out.println(p2.name + " lives in " + p2.address.city); // Bob lives in Mumbai
    }
}