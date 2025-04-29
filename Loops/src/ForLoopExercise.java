import java.util.Scanner;

public class ForLoopExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = input.nextInt();
        MyNumber number = new MyNumber(value);
        System.out.println("Is Number Prime?:" + number.isPrime());

        System.out.println("Sum: "+number.sumUptoN());

        System.out.println(("Sum of Divisors: "+ number.sumOfDivisors()));
        System.out.println("Print a number triangle: ");
        number.printANumberTriangle();
    }
}
