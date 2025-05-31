package com.lld.design.patterns.creational.factory.buttons;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicking IOS Button");
    }
}
