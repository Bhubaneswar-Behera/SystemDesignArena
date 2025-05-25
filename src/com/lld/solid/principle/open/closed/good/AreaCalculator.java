package com.lld.solid.principle.open.closed.good;

public class AreaCalculator {
    int calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
