import java.util.Scanner;

public class GCDOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("GCD of two numbers: " + gcdOfNumbers(number1, number2));
    }

    public static int gcdOfNumbers(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        if (number1 < 0 || number2 < 0) {
            return 1;
        }
        if(number1 == number2) {
            return number1;
        }
        int minValue = Math.min(number1, number2);
        int gcd = minValue;
        while (minValue > 1) {
            boolean ifFinalGcd = (number1 % minValue == 0 && number2 % minValue == 0);
            if (ifFinalGcd) {
                return gcd;
            }
            gcd = --minValue;
        }
        return gcd;
    }
}
