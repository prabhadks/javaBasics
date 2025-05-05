package com.learnings.examples.interfaces;


import java.util.ArrayList;

public class FlyableRunner {

    public static void main(String[] args) {
        ArrayList<Flyable> flyableObjects = new ArrayList<Flyable>();
        flyableObjects.add(new Bird());
        flyableObjects.add(new Aeroplane());
        for (Flyable flyable : flyableObjects) {
            flyable.fly();
        }
    }
}
