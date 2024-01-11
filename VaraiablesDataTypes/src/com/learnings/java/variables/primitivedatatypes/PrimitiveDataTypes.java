package com.learnings.java.variables.primitivedatatypes;

import java.util.Scanner;

/**
 * This program is about Primitive Data Types and operations
 */
public class PrimitiveDataTypes {
    public static void main(String[] args){
        //variable b of byte data type declaration and initialization in same line
        byte b = 89;
        //printing the value of variable
        System.out.println("variable of byte b contains following value: " + b);

        //variable s of int data type declaration in one line and intialization in another line
        short s;
        s = 200;
        System.out.println("variable of short s contains following value: " + s);

        //Updating the value of the variable
        s = 200 + 10;
        System.out.println("variable of short s contains following value: " + s);
        //Implicit conversion. source type is smaller than target type and can fit without losing any information
        int i = s;
        System.out.println("variable of int i contains following value: " + i);

        //Declare and initialize double data type
        double d = 100.24;
        System.out.println("variable of double d contains following value: " + d);

        //Explicit conversion. source type is larger than target type and may lose information
        i = (int) d;
        System.out.println("variable of int i contains following value: " + i);

        //Declare and initialize float data type
        float f = 100.24f;
        System.out.println("variable of float f contains following value: " + f);

        //Declare and initialize char data type
        char c = 'A';
        System.out.println("variable of char c contains following value: " + c);

        //Declare and initialize boolean data type
        boolean b1 = true;
        System.out.println("variable of boolean b1 contains following value: " + b1);

        //Autoboxing. Converts the primitive data to wrapper data type
        Integer z = i;
        System.out.println("variable of Integer z contains following value: " + z);

        //Unboxing. Converts the wrapper data type to primitive data type
        Double doubleWrapper = new Double(10.25);
        double doublePrimitive = doubleWrapper;
        System.out.println("variable of doublePrimitive contains following value: " + doublePrimitive);
        areaOfRectangle();
    }

    /**
     * This method calculates area of rectangle by taking user input
     */
    public static void areaOfRectangle(){
        //Scanner object to accept user input from the keyboard
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = s.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = s.nextInt();

        double area = length * breadth;
        System.out.println("Area of rectangle with length: "+ length + " and breadth: " + breadth + " is:  "+ area);
    }
}
