package com.learnings.examples.interfaces;

public class Subtract implements Operation{

    private int number1;
    private int number2;

    @Override
    public int perform(int number1, int number2) {

        return number1 - number2;
    }
}
