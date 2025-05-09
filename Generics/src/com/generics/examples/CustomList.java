package com.generics.examples;

import java.util.ArrayList;
import java.util.List;

//Generic class with type T
public class CustomList<T> {

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
