import java.util.ArrayList;
import java.util.Scanner;

public class ReturnFactorsOfANumInArraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you would like to know the factors: ");
        int number = scanner.nextInt();
        System.out.println("Factors are: "+ determineAllFactors(number));
    }

    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */

    public static ArrayList<Integer> determineAllFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<Integer>();
        if(number <= 0) {
            return factorsList;
        }
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList;
    }
}
