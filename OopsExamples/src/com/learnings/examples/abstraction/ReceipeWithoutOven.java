package com.learnings.examples.abstraction;

public class ReceipeWithoutOven extends ReceipeAbstract{
    @Override
    public void setup() {
        System.out.println("Get all the ingredients required");
        System.out.println("Get all the utensils required");
        System.out.println("Switch on the stove");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare the dish");
        System.out.println("Switch off the stove");
    }

    @Override
    public void cleanup() {
        System.out.println("Clean the utensils");
        System.out.println("Clean the stove");
    }
}
