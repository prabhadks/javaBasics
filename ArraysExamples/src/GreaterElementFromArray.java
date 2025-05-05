import java.util.ArrayList;
import java.util.Scanner;

public class GreaterElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an integer array");
        int[] intArray = new int[scanner.nextInt()];
        for(int i = 0; i < intArray.length; i ++) {
            System.out.println("Enter the element to be stored in integer array");
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the number that would be compared with integer array to see if there is any number in array greater than the given number");
        int numToCompare = scanner.nextInt();
        System.out.println("Does the element greater than the given number exists in array: ");
        System.out.println(doesHaveElementGreaterThan(intArray, numToCompare));
    }

    public static boolean doesHaveElementGreaterThan(int[] integerArray, int number) {
        if(integerArray.length == 0) {
            return false;
        }
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] > number) {
                return true;
            }
        }
        return false;
    }
}
