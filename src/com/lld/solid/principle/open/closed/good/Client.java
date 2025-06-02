package com.lld.solid.principle.open.closed.good;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area of Rectangle: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Area of Circle: " + areaCalculator.calculateArea(circle));
    }
}
