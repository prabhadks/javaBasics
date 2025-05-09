package com.examples.MapProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfWordsOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        Map<String, Integer> stringsMap= new HashMap<>();
        for(String word: words) {
            if(stringsMap.get(word) != null){
                int value =  stringsMap.get(word) + 1;
                stringsMap.put(word, value);
            } else {
                stringsMap.put(word, 1);
            }

        }
        System.out.println(stringsMap);
        for (Map.Entry<String, Integer> entry: stringsMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
