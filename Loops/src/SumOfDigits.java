import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Sum of digits: "+ sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
