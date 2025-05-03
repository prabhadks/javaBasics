package com.company;

import java.util.Scanner;

public class RightMostDigitInString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("Get Right Most Char in the String: " + getRightMostDigit(input));
    }

    public static int getRightMostDigit(String input) {
        if(input == null || input.isEmpty()) {
            return -1;
        }
        for(int i = input.length() - 1; i >= 0; i--) {
            char charValue = input.charAt(i);
            if(Character.isDigit(charValue)){
                return Character.getNumericValue(charValue);
            }
        }
        return -1;
    }
}
