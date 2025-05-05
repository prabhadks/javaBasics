package com.learnings.examples.abstraction;

public class ReceipeRunner {

    public static void main(String[] args) {
        ReceipeWithoutOven receipeWithoutOven = new ReceipeWithoutOven();
        receipeWithoutOven.execute();
        System.out.println("---------------------------------------");
        ReceipeWithOven receipeWithOven = new ReceipeWithOven();
        receipeWithOven.execute();
    }
}
