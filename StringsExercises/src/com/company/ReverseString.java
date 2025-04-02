package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
	// write your code here
        String name = "Prabhavathi Dodda";
      //get the length of the string. And using for loop iterate from last to 0.
        char[] charArray = name.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        for(int i = charArray.length - 1; i >= 0; i--) {
            reversedString.append(charArray[i]);
        }
        System.out.println("Reverse String for "+name+" is: "+reversedString);
    }
}
