package com.company;

import java.util.Scanner;

public class CountUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("Count of Uppercase in the given String: " + getUpperCaseCount(input));
    }

    public static int getUpperCaseCount(String input) {
         /*
        If the string is empty, the method should return 0.
        If the string does not contain any uppercase letters, the method should also return 0.
         */
        if (input.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
