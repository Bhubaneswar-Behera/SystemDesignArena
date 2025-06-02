package com.lld.solid.principle.liskov.substitution.good;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        // Sparrow can fly
        if (sparrow instanceof FlyingBird) {
            ((FlyingBird) sparrow).fly();
        }

        // Ostrich cannot fly, so we don't call fly on it
        // ostrich.fly(); // This would be incorrect and is avoided by design
    }
}
