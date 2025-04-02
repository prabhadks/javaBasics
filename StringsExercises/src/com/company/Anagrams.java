package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        //Anagram -> length should be same and letters should be same
        //Step 1: Find length. If not equal then not a anagram
        //Step 2: Sort both the strings. And compare both strings.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scanner.next();
        System.out.println("Enter second word");
        String word2 = scanner.next();
        if(word1.length() == word2.length()) {
            char[] word1Array = word1.toCharArray();
            char[] word2Array = word1.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);
           if(Arrays.equals(word1Array, word2Array)) {
               System.out.println("Two words are Anagrams "+word1 + ", "+word2);
           }else{
               System.out.println("Two words are not Anagrams "+word1 + ", "+word2);
           }
        }else{
            System.out.println("Two words are not Anagrams "+word1 + ", "+word2);
        }
    }
}
