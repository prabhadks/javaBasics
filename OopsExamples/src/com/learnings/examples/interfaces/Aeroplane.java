package com.learnings.examples.interfaces;

public class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
