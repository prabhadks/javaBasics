import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        long number = scanner.nextInt();
        int count = 0;
        long reverseNumber = getReverseNumber(number);
        while (!isPalindrome(number)) {
            number = getSum(number, reverseNumber);
            reverseNumber = getReverseNumber(number);
            count++;
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(Long number) {
        String reverseNumberString = getReverseNumber(number).toString();
        return reverseNumberString.equals(number.toString());
    }

    public static Long getReverseNumber(Long number) {
        char[] chars = number.toString().toCharArray();
        String reverseNumberString = null;
        for(int i = chars.length - 1; i >= 0; i--) {
            if (reverseNumberString == null) {
               reverseNumberString = String.valueOf(chars[i]);
            }
           else{
                reverseNumberString = reverseNumberString.concat(String.valueOf(chars[i]));
            }
        }
        return reverseNumberString != null ? Long.parseLong(reverseNumberString) : 0;
    }

    public static long getSum(long actualNumber, long reverseNumber) {
        return (actualNumber + reverseNumber);
    }
}
