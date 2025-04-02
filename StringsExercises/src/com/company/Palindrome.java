package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = value.next();

        System.out.println("Enter second word");
        String word2 = value.next();
        char[] word1Array = word1.toCharArray();

        String reversedString = "";
        for(int i = word1Array.length - 1; i >= 0; i--) {
           reversedString = reversedString + word1Array[i];
        }
        if(reversedString.equals(word2)) {
            System.out.println("Strings are palindrome "+word1 +" , "+word2);
        } else {
            System.out.println("Strings are not palindrome "+word1 +" , "+word2);
        }
    }
}
