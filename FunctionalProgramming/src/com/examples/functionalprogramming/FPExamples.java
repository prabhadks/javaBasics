package com.examples.functionalprogramming;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPExamples {
    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Bat", "Cat", "Dog");

        printFunction(stringList);
        printFunctionWithFP(stringList);

        List<Integer> integerList = List.of(1, 2, 5, 9, 10, 13);

        printEvenNumbers(integerList);
        printFunctionEvenNumbersWithFP(integerList);

        printOddNumbers(integerList);
        printFunctionOddNumbersWithFP(integerList);

        sumNumbersWithFP(integerList);
        sumEvenNumbersWithFP(integerList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which cubes has to be calculated: ");
        System.out.println(cubesOfNumber(scanner.nextInt()));

        List<String> courseNames = List.of("Java Programing", "Selenium Tutorial", "Playwright for Beginners");
        getCourseNameCharactersLength(courseNames);

        System.out.println(getSumOfSquares(integerList));
        System.out.println(findMaxEvenNumber(integerList));

    }

    //printFunctionTraditional approach
    public static void printFunction(List<String> list) {
        System.out.println("Traditional Approach print function executing");
        for (String value : list) {
            System.out.println(value);
        }
    }

    //printFunctionTraditional approach
    public static void printEvenNumbers(List<Integer> list) {
        System.out.println("Traditional Approach print even number function executing");
        for (Integer value : list) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }

    public static void printOddNumbers(List<Integer> list) {
        System.out.println("Traditional Approach print Odd number function executing");
        for (Integer value : list) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }
    }

    //printFunctionUsingFP approach
    public static void printFunctionWithFP(List<String> list) {
        System.out.println("Functional Programming Approach print function executing");
        list.stream().forEach(element -> System.out.println(element));
    }

    public static void printFunctionEvenNumbersWithFP(List<Integer> list) {
        System.out.println("Functional Programming Approach print even number function executing");
        list.stream()
                .filter(element -> element % 2 == 0)
                .forEach(element -> System.out.println(element));
    }

    public static void printFunctionOddNumbersWithFP(List<Integer> list) {
        System.out.println("Functional Programming Approach print odd number function executing");
        list.stream()
                .filter(element -> element % 2 != 0)
                .forEach(element -> System.out.println(element));
    }

    public static void sumNumbersWithFP(List<Integer> list) {
        System.out.println("Functional Programming Approach print sum of all numbers executing");
        int sum = list.stream()
                .reduce(0, (element1, element2) -> element1 + element2);
        System.out.println(sum);
    }

    public static void sumEvenNumbersWithFP(List<Integer> list) {
        System.out.println("Functional Programming Approach print sum of even numbers executing");
        int sum = list.stream()
                .filter(element -> element % 2 == 0)
                .reduce(0, (element1, element2) -> element1 + element2);
        System.out.println(sum);
    }

    public static List<Integer> cubesOfNumber(Integer number) {
        System.out.println("Cubes of number till: " + number);
        return IntStream.range(1, number + 1)
                .map(n -> n * n * n)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> getCourseNameCharactersLength(List<String> courseNames) {
        System.out.println("Length of course Names in the list: " + courseNames);
        if (courseNames == null) {
            return List.of();
        }
        return courseNames.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static int getSumOfSquares(List<Integer> integerList) {
        System.out.println("Get Sum of Squares from list: "+ integerList);
        return integerList.stream()
                .reduce(0, (number1, number2) -> (number1 + (number2 * number2)));
    }

    public static int findMaxEvenNumber(List<Integer> integerList) {
        System.out.println("Get Max Even number from the list: "+ integerList);
        if(integerList == null || integerList.isEmpty()) {
            return 0;
        }
        return integerList.stream()
                .filter(number -> number%2 == 0)
                .max(Integer::compareTo)
                .orElse(0);
    }
}
