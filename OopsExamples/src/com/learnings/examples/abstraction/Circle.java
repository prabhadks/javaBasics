package com.learnings.examples.abstraction;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        BigDecimal value = new BigDecimal(Math.PI)
                .multiply(new BigDecimal(radius))
                .multiply(new BigDecimal(radius))
                .setScale(2, RoundingMode.UP);
        return value.doubleValue();
    }
}
