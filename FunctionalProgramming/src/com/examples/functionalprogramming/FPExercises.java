package com.examples.functionalprogramming;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //print squares of first n numbers
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        printSquareNumbers(number);
        System.out.println(printSquareNumbersWithCollectTerminalOperator(number));

        //print lower case of all strings
        List<String> stringList = List.of("Apple", "Ant", "Bat");
        printLowerCase(stringList);

        //print length of each string
        printStringLength(stringList);

        //print max number
        List<Integer> integerList = List.of(1,6,9,23,90,45);
        System.out.println(printMaxValue(integerList));

        //print min number
        System.out.println(printMinValue(integerList));

        //print odd numbers
        System.out.println(printOddNumbers(integerList));
    }

    public static List<Integer> printOddNumbers(List<Integer> integerList) {
        System.out.print("Odd Numbers: ");
        return integerList.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
    }

    public static void printSquareNumbers(int number) {
        System.out.println("Square Numbers printed from stream: ");
        IntStream.range(1, number+1)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    public static List<Integer> printSquareNumbersWithCollectTerminalOperator(int number) {
        System.out.println("Square Numbers in list: ");
        return IntStream.range(1, number + 1)
                .map(n -> n * n)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void printLowerCase(List<String> stringList) {
        System.out.println("Lower case: "+ stringList);
        stringList.stream().map(String::toLowerCase)
                .forEach(System.out::println);
    }

    public static void printStringLength(List<String> stringList) {
        System.out.println("Distinct and sorted length of strings:  "+ stringList);
        stringList.stream().map(String::length)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static int printMaxValue(List<Integer> integerList) {
        System.out.println("Print Max value from list: "+ integerList);
       return integerList.stream()
                .max(Integer::compare)
               .orElse(0);
    }

    public static int printMinValue(List<Integer> integerList) {
        System.out.println("Print Min value from list: "+ integerList);
        return integerList.stream()
                .min(Integer::compare)
                .get();
    }
}
