package com.generics.examples;

import java.util.ArrayList;
import java.util.List;

//Generic class with data type which extends only Number class. No other data types allowed.
public class CustomListExtends<T extends Number> {
    List<T> arrayList = new ArrayList<>();

    public void addElement(T value) {
        arrayList.add(value);
    }

    public T getElement(int index) {
        return arrayList.get(index);
    }

    public String toString() {
        return arrayList.toString();
    }

}
