package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepetitiveCharInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.next();
        Character value = getFirstNonRepetitiveChar(word);
        if(value != '\0') {
            System.out.println("First non repetitive character in string " + word + " is: " + value);
        };
    }

    public static Character getFirstNonRepetitiveChar(String word) {
        Map<Character, Integer> counterMap = new LinkedHashMap<>();
        for (char c : word.toCharArray()) {
            counterMap.put(c, counterMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
