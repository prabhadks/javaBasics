package com.learnings.examples.abstraction;

public class ReceipeWithOven extends ReceipeAbstract{
    @Override
    public void setup() {
        System.out.println("Get all the ingredients required");
        System.out.println("Get all the utensils required");
        System.out.println("Switch on the microwave");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare the dish");
        System.out.println("Switch off the microwave");
    }

    @Override
    public void cleanup() {
        System.out.println("Clean the utensils");
        System.out.println("Clean the microwave");
    }
}
