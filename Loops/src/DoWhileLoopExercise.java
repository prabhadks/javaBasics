import java.util.Scanner;

public class DoWhileLoopExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Cube is:" + number * number * number);
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("Thank You! Have Fun!");
    }
}
