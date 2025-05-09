package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordReverser {
    /*
    Coding Exercise - Word Reverser
    In this exercise, you are required to write a Java method called reverseWordsInSentence within the provided StringMagic class.
    The method should take a string sentence as input and return a string in which each word in the sentence is reversed while maintaining the original word order.
    Edge conditions:
    If the input string is null, your method should return the string "INVALID".
    If the input string is empty (i.e., ""), your method should return an empty string.

    Input Format:
    A single string which is a sentence.
    Output Format:
    A string in which each word in the sentence is reversed while maintaining the original word order.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        reverseWordsInSentence(sentence);
    }

    public static String reverseWordsInSentence(String sentence) {
        if (sentence == null) {
            return "INVALID";
        } else if (sentence.isEmpty()) {
            return "";
        } else {
            String[] strings = sentence.split(" ");
            StringBuilder reverseSentenceBuilder = new StringBuilder();
            for (String word : strings) {
                reverseSentenceBuilder.append(reverseWord(word)).append(" ");
            }
            return reverseSentenceBuilder.toString().trim();
        }
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
