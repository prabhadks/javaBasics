package com.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    public static void main(String[] args) {
        //Generics - Means the the classes/ methods are not definied to specific data type. They are created at Generic datatype
        CustomList<String> list1 = new CustomList<>();
        list1.addElement("Apple");
        list1.addElement("Bat");
        list1.addElement("Cat");
        System.out.println(list1);
        System.out.println(list1.getElement(0));
        System.out.println(list1.getElement(1));
        System.out.println(list1.getElement(2));

        CustomList<Integer> list2 = new CustomList<>();
        list2.addElement(1);
        list2.addElement(2);
        list2.addElement(3);
        System.out.println(list2);
        System.out.println(list2.getElement(0));
        System.out.println(list2.getElement(1));
        System.out.println(list2.getElement(2));

    CustomListExtends<Double> list3 = new CustomListExtends<>();
        list3.addElement(1.5);
        list3.addElement(2.5);
        list3.addElement(3.5);
        System.out.println(list3);
        System.out.println(list3.getElement(0));
        System.out.println(list3.getElement(1));
        System.out.println(list3.getElement(2));


        CustomListExtends<Integer> list4 = new CustomListExtends<>();
        list4.addElement(1);
        list4.addElement(2);
        list4.addElement(3);
        System.out.println(list2);
        System.out.println(list4.getElement(0));
        System.out.println(list4.getElement(1));
        System.out.println(list4.getElement(2));

        GenericsMethodLevel genericsMethodLevel = new GenericsMethodLevel();
        List<Integer> integerList = List.of(1,5,8,20,50);
        genericsMethodLevel.printValuesWildCard(integerList);
        List<String> stringList = List.of("Apple", "Bat");
//        genericsMethodLevel.printValues(stringList); // Results in a compile time error.
        List<Integer> arrayList = new ArrayList<>(integerList);
        genericsMethodLevel.addValues(arrayList, 10);
        genericsMethodLevel.printValuesWildCard(arrayList);
    }
}
