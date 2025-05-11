package com.generics.examples;

import java.util.Scanner;

public class TypeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int intCount = 0;
        int stringCount = 0;
        int doubleCount = 0;

        for(String word : words) {
         if(isInteger(word)) {
             intCount++;
         } else if(isDouble(word)){
             doubleCount++;
         } else{
             stringCount++;
         }
        }
        System.out.println("string "+ stringCount);
        System.out.println("integer "+ intCount);
        System.out.println("double "+ doubleCount);
    }

    public static boolean isDouble(String word) {
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInteger(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
