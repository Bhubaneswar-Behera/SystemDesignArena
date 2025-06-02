package com.lld.solid.principle.interfacesegreation.good;

public class Client {
    public static void main(String[] args) {
        Eater dog = new Dog();
        dog.eat(); // Dog can eat

        Flyer bird = new Bird();
        bird.fly(); // Bird can fly

        Eater birdAsEater = new Bird();
        birdAsEater.eat(); // Bird can also eat
    }
}
