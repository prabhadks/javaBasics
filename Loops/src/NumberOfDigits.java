import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Number of digits:" + getNumberOfDigits(number));
    }

    public static int getNumberOfDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int noOfDigits = 0;

        while (number > 0) {
            number = number / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }
}
