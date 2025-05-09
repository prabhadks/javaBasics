import java.util.Scanner;

public class PlaindromeCheckUsingStringBuilder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int number = scanner.nextInt();
        int count = 0;
        int reverseNumber = getReverseNumber(number);
        while (!isPalindrome(number)) {
            number = getSum(number, reverseNumber);
            reverseNumber = getReverseNumber(number);
            count++;
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(Integer number) {
        String reverseNumberString = getReverseNumber(number).toString();
        return reverseNumberString.equals(number.toString());
    }

    public static Integer getReverseNumber(Integer number) {
        String reverseNumberString = new StringBuilder(number.toString()).reverse().toString();
        return Integer.parseInt(reverseNumberString);
    }

    public static int getSum(int actualNumber, int reverseNumber) {
        return (actualNumber + reverseNumber);
    }

}
