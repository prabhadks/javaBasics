import java.util.Scanner;

public class LCMOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("LCM of two numbers: " + lcmOfNumbers(number1, number2));
    }

    public static int lcmOfNumbers(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        if (number1 < 0 || number2 < 0) {
            return -1;
        }
        int maxValue = Math.max(number1, number2);
        int lcm = maxValue;
        while (true) {
            boolean ifFinalLcm = (lcm % number1 == 0 && lcm % number2 == 0);
            if (ifFinalLcm) {
                return lcm;
            }
            lcm = lcm + maxValue;
        }
    }
}

