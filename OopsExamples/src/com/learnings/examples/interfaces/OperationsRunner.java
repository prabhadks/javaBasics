package com.learnings.examples.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Addition of two numbers: "+ new Add().perform(num1, num2));
        System.out.println("Subtraction of two numbers: "+ new Subtract().perform(num1, num2));
        System.out.println("Division of two numbers: "+ new Divide().perform(num1, num2));
    }
}
