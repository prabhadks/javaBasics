package com.learnings.examples.interfaces;

public class Divide implements Operation{

    private int number1;
    private int number2;

    @Override
    public int perform(int number1, int number2) {
        if(number2 == 0) {
            return -1;
        }
        return number1 / number2;
    }
}
