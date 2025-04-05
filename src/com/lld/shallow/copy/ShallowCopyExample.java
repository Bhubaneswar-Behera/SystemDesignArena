package com.lld.shallow.copy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}
class Person {
    String name;
    Address address;

    // Shallow Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.address = other.address;  // Same reference
    }

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
public class ShallowCopyExample {
    public static void main(String[] args) {
        Address addr = new Address("Delhi");
        Person p1 = new Person("Alice", addr);
        Person p2 = new Person(p1);  // Shallow copy
        p2.name = "Bob";
        p2.address.city = "Mumbai"; // Affects both

        System.out.println(p1.name + " lives in " + p1.address.city); // Alice lives in Mumbai
        System.out.println(p2.name + " lives in " + p2.address.city); // Bob lives in Mumbai
    }
}

