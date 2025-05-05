package com.learnings.examples.abstraction;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Area of " + this.name);
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }

    public String toString() {
        return String.valueOf(calculateArea());
    }

}
