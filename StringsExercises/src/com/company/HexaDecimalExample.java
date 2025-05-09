package com.company;

import java.util.Scanner;

public class HexaDecimalExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println(isHexadecimal(str));
    }

    public static boolean isHexadecimalChar(char ch) {
        return (ch >= 65 && ch <= 70) || (ch >= 97 && ch <= 102);
    }

    public static boolean isHexadecimal(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
