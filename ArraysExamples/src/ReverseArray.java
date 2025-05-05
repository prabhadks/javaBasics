import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array2 = {5,4,32,1,4};
        int[] reversed = reverseArray(array2);
        System.out.println("Reverse the array: "+ Arrays.toString(reversed));
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int index = array.length - 1;
        for(int i = 0; i < array.length; i++ ){
          reverse[i] = array[index];
          index--;
        }
        return reverse;
    }
}
