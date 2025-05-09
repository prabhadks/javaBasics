package com.examples.MapProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProblems {
    public static void main(String[] args) {
        Map<Integer, String> numbers = Map.of(1, "One", 10, "Ten", 20, "Twenty", 2, "Two", 11, "Eleven");
        System.out.println("Default position: " + numbers);
        Map<Integer, String> numbersHashMap = new HashMap<>(numbers);
        System.out.println("Hashmap position: " +numbersHashMap);
        Map<Integer, String> numbersLinkedHashMap = new LinkedHashMap<>(numbers);
        System.out.println("Linked Hash Map position. Hence Insertion order is maintained: " +numbersLinkedHashMap);
        Map<Integer, String> numbersTreeMap = new TreeMap<>(numbers);
        System.out.println("Tree Map position sorted: " +numbersTreeMap);
    }
}
