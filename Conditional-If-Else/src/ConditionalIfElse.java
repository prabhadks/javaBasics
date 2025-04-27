import java.util.Scanner;

public class ConditionalIfElse {
    public static void main(String[] args) {
        System.out.println("Enter Number1:");
        Scanner input = new Scanner(System.in);
        int number1= input.nextInt();
        System.out.println("Enter Number2:");
        int number2= input.nextInt();
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.println("Choose Operation:");
        int operation = input.nextInt();
        operationsMenu(operation, number1, number2);
    }

    public static void operationsMenu(int operation, int number1, int number2) {
        if(operation == 1) {
            System.out.println("Addition of two numbers: "+(number1 + number2));
        } else if(operation == 2) {
            System.out.println("Subtraction of two numbers: "+ (number1 - number2));
        }else if(operation == 3) {
            System.out.println("Divide of two numbers: "+ (number1 / number2));
        }else if(operation == 4) {
            System.out.println("Multiply of two numbers: "+ (number1 * number2));
        }else {
            System.out.println("Value of operation should be between 1 to 4");
        }
    }
}
