package com.lld.design.patterns.creational.factory.buttons;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android button clicking");
    }
}
