import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        System.out.println("Reverse of the Number: " + reverseNumber(number));
    }

    public static int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}
