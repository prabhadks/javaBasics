import java.util.ArrayList;
import java.util.Scanner;

public class ReturnMultiplesOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you would like to know the multiples: ");
        int number = scanner.nextInt();
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        System.out.println("Mutiples are: "+ determineMultiples(number, limit));
    }

    public static ArrayList<Integer> determineMultiples(int number, int limit) {
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        if(number <=0 || limit <= 0) {
            return multiples;
        }
        int i = 1, multiple = 1;
        while(number * i < limit) {
            multiple = number * i;
            multiples.add(multiple);
            i++;
        }
        return multiples;
    }
}
