import java.util.Scanner;

public class WhileLoopExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number limit");
        WhileNumberPlayer player = new WhileNumberPlayer(scanner.nextInt());
        player.printSquaresUptoLimit();
        player.printCubesUptoLimit();
    }
}
