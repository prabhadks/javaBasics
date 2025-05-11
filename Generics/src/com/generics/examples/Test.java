package com.generics.examples;

public class Test {

    public static void main(String[] args) {
        try {
            Float f = new Float("3.0");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x + b + d);
        }
        catch (NumberFormatException e){
            System.out.println("Bad number");
        }

        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);
    }
}
