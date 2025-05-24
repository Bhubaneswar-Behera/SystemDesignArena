package com.lld.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //list.add("Ten")//; // This line will cause a compile-time error because "Ten" is not an Integer

        Pair pair = new Pair();
        pair.setFirst(1);
        pair.setSecond("Two");
        System.out.println("First: " + pair.getFirst());

        GenericPair<String, Integer> genericPair = new GenericPair<>();
        genericPair.setFirst("One");
        genericPair.setSecond(2);
        System.out.println("Generic First: " + genericPair.getFirst());


        AnimalUtility.printAnimalDetails();
    }

}
