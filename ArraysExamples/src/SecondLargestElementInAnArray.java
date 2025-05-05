import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an integer array");
        int[] intArray = new int[scanner.nextInt()];
        for(int i = 0; i < intArray.length; i ++) {
            System.out.println("Enter the element to be stored in integer array");
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Second largest number in an array is: ");
        System.out.println(findSecondLargestElement(intArray));
    }

    public static int findSecondLargestElement(int[] array) {
        if(array.length <= 1) {
            return -1;
        }
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = value;
            } else if (value > secondLargestNumber && value != firstLargestNumber) {
                secondLargestNumber = value;
            }
        }
        if(secondLargestNumber == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargestNumber;
    }
}
