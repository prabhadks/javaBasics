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
        System.out.println("variable of short s after updating value contains : " + s);
        //Implicit conversion. source type is smaller than target type and can fit without losing any information
        int i = s;
        System.out.println("variable of int i after assigning s variable: " + i);

        //Declare and initialize double data type
        double d = 100.24;
        System.out.println("variable of double d contains following value: " + d);

        //Explicit conversion. source type is larger than target type and may lose information
        i = (int) d;
        System.out.println("variable of int i after casting double value: " + i);

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
        arithmeticOperations();
    }

    /**
     * This method shows the arithmetic operations performed on variables
     * Addition, Multiplication, Subtraction, Division are arithmetic operations
     */
    public static void arithmeticOperations(){

        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("Addition of two numbers "+a+" and "+ b +" is: "+ c);

        double a1 = 10;
        double b1 = 20;
        double c1 = a1 + b1;
        double c2 = a + b;

        System.out.println("Output of adding two double numbers "+a1+" and "+ b1 +" saved in variable with double data type:: "+ c1);
        System.out.println("Output of adding two integer numbers "+a+" and "+ b +" saved in variable with double data type: "+ c2);

        double c3 = b1 - a1;
        double c4 = b - a;

        System.out.println("Output of subtracting two double numbers "+a1+" and "+ b1 +" saved in variable with double data type:: "+ c3);
        System.out.println("Output of subtracting two integer numbers "+a+" and "+ b +" saved in variable with double data type: "+ c4);
        
        // Dividing two integers, result will be an integer. Portion after the decimal is ignored
        int q = 22 / 3 ;
        //Dividing two doubles, result will be double
        double q1 = b1 / a1;
        System.out.println("Result of dividing 22 by 3 :"+q);
        System.out.println("Result of dividing "+b1+" by "+ a1 +" :"+q1);

        //mod operator results in remainder
        int m1 = 22 % 3 ;
        double m2 = 22 % 3 ;
        System.out.println("Remainder of dividing 22 by 3 saved in integer variable:"+m1);
        System.out.println("Remainder of dividing 22 by 3 saved in double variable:"+m2);

    }

    /**
     * This method calculates area of rectangle by taking user input
     * This covers the multiplication operation
     */
    public static void areaOfRectangle(){
        //Scanner object is created. s is the name of the Scannner
        //new Scanner(System.in) prompts Java to provide new Scanner to scan the input given by users
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        //Below statement reads integer data given as input from user and stores in length variable
        int length = s.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = s.nextInt();

        double area = length * breadth;
        System.out.println("Area of rectangle with length: "+ length + " and breadth: " + breadth + " is:  "+ area);
    }


}
