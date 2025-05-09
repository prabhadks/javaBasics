package com.examples.MapProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfCharactersOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        String sentenceWithoutSpaces = sentence.replace(" ", "");
        char[] characters = sentenceWithoutSpaces.toCharArray();
        Map<Character, Integer> charactersMap= new HashMap<>();
        for(char character: characters) {
            if(charactersMap.get(character) != null){
                int value =  charactersMap.get(character) + 1;
                charactersMap.put(character, value);
            } else {
                charactersMap.put(character, 1);
            }

        }
        System.out.println(charactersMap);
        for (Map.Entry<Character, Integer> entry: charactersMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
