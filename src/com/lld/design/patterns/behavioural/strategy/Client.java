package com.lld.design.patterns.behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi", "Agra", "Car");
    }
}
