package com.lld.generics;

import java.util.List;

public class AnimalUtility {
    public static <T extends Animal> void printAnimalDetails(List<T> animals) {
        for (T animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
