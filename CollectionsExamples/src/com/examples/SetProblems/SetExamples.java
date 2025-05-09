package com.examples.SetProblems;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {
        List<Character> characterList = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

        //print the unique characters in Ascending order
        Set<Character> treeSet = new TreeSet<>(characterList);
        System.out.println("TreeSet" + treeSet);

        //maintain the sequence in the list and remove duplicates
        Set<Character> linkedHashSet = new LinkedHashSet<>(characterList);
        System.out.println("LinkedHashSet" +linkedHashSet);

        //print the unique characters. Don't care about the sequence or order
        Set<Character> characterSet = new HashSet<>(characterList);
        System.out.println("Hashset" + characterSet);

        NavigableSet<Integer> treeSet1 = new TreeSet<>(Set.of(10, 34, 5, 30, 54));
        System.out.println(treeSet1);
        System.out.println("Greatest element in the set less than or equal to specified number:" + treeSet1.floor(34));
        System.out.println("Greatest element in the set less than the specified number:" + treeSet1.lower(34));
        System.out.println("Least element in the set greater than or equal to specified number:" + treeSet1.ceiling(34));
        System.out.println("Least element in the set greater than the specified number:" + treeSet1.higher(34));
        System.out.println("All the elements in the set less than the specified number:" + treeSet1.headSet(34));
        System.out.println("All the elements in the set greater than the specified number:" + treeSet1.tailSet(34));
    }
}
