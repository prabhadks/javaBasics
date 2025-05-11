package com.generics.examples;

import java.util.List;

public class GenericsMethodLevel {

    //Declaring the type of parameter infront of return type. Its a bounded type that means, type can be any thing that extends Number class
    //can be int, double, long, float. But not String, boolean
    public <T extends Number> void printValues(T value) {
        System.out.println(value);
    }

   // Using Wildcard. Type is unknown. This is upperbound. As at compile time, type is unknown. It can be Number or any of its subtypes.
   // Add cannot be performed. Except adding null. Only read
    public void printValuesWildCard(List<? extends Number> values) {
        for (Object object: values) {
            System.out.println(object);
        }
    }

    // Using Wildcard. Type is unknown. This is lowerbound. As at compile time, type is unknown. It can be Integer or its super classes like Number, Object.
    // Add can be performed.
    public List<? super Integer> addValues(List<? super Integer> values, Integer value) {
       values.add(value);
       return values;
    }
}
