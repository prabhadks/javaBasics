package com.company;

import java.util.Scanner;

public class TwoConsecutiveCharactersInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("Does Two Consecutive Chars exits in String: " + IsTwoConsecutiveCharsExistsInString(input));
    }

    /*
    str is a String of length n (0 ≤ n ≤ 1000). The string may contain any printable ASCII characters.
    The method should return true if there are two consecutive identical characters in the string and false otherwise.
    */
    public static boolean IsTwoConsecutiveCharsExistsInString(String input) {
        int inputLength = input.length();
        for (int i = 0; i < inputLength - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
