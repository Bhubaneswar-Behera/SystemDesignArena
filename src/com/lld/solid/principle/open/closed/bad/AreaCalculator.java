package com.lld.solid.principle.open.closed.bad;

public class AreaCalculator {
    int calculateArea(Shape shape) {
        if (shape.type.equals("circle")) {
            return 1;
        }
        else if (shape.type.equals("rectangle")) {
            return 2;
        }
        return 0;
    }
}
