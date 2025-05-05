import java.util.Scanner;

public class WrapperClassesExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Auto-boxing or boxing -- Primitive data type is automatically converted to Integer Reference type
        Integer autoBoxingValue = scanner.nextInt();
        System.out.println(autoBoxingValue);
        System.out.println("Convert Integer to float: " + autoBoxingValue.floatValue());
        System.out.println("Convert Integer to Double: " + autoBoxingValue.doubleValue());
        //Unboxing -- converting Reference type to primitive data type
        int unboxValue = autoBoxingValue;
        System.out.println(unboxValue);
    }
}
