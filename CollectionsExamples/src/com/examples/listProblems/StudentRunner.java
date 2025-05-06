package com.examples.listProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        List<Integer> values = List.of(1,5,18,9,10);
        List<Integer> valuesArrayList = new ArrayList<>(values);
        Collections.sort(valuesArrayList);
        System.out.println(valuesArrayList);
        List<Student> list = List.of(new Student(1, "Test1"),
                new Student(5, "Test2"),
                new Student(3, "Test 3"));
        System.out.println(list);

        List<Student> studentArrayList = new ArrayList<>(list);
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);

        List<Student> list1 = List.of(new Student(1, "Test1"),
                new Student(5, "Test2"),
                new Student(3, "Test 3"));
        List<Student> list1ArrayList = new ArrayList<>(list1);
        list1ArrayList.sort(new StudentDescendingComparator());
        System.out.println(list1ArrayList);
    }
}
