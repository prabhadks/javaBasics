import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        //Method 1: Declaring an integer array with size
        int[] numbers = new int[5];
        //Storing values in an array
        numbers[0] = 19;
        numbers[1] = 10;
        numbers[2] = 99;
        numbers[3] = 100;
        numbers[4] = 2;

        System.out.println("First element in numbers array: " + numbers[0]);

        //Method 2: Declaring an String array
        String colors[];
        //Initializing values in an array
        colors = new String[]{"Red", "Orange", "Yellow", "Blue"};
        System.out.println("Third element in colors array: " + colors[2]);

        //Method 3: Declaring and intializing in a single line
        char[] characterArray = {'C', 'H', 'I', 'T', 'Z', 'O'};
        System.out.println("Last element in characterArray: " + characterArray[characterArray.length - 1]);

        //Method 4: Declaring and intializing in a single line
        float[] floats = new float[]{13.33f, 2.5f, 3.0f, 9.0f};
        System.out.println("Before Sort: "+Arrays.toString(floats));
        Arrays.sort(floats);
        System.out.println("After Sort: "+Arrays.toString(floats));

        //Method 5:
        double[] decimals;
        decimals = new double[]{3.4, 1.0, 2.0};
        System.out.println("First element of double array: "+decimals[0]);

        //Multi Dimensional array. First length refer to number of rows, second array length refer to number of columns
        int[][] multi = new int[3][4];
        multi[0][0] = 1;
        multi[0][1] = 2;
        multi[0][2] = 3;
        // In multi dimensional array, length gives the first dimension. That means gets the rows
        System.out.println("Multi Dimensional array length: "+multi.length);
        //To get the column length
        System.out.println("Multi Dimensional column array length: "+multi[0].length);

        //Declare and initialize multi dimensional array in single line
        int[][] dimensions = {
                {1,5,6},
                {10,40,20},
                {1,80,20},
                {4,6,8}};
        System.out.println(dimensions.length);
        System.out.println(dimensions[0].length);
    }
}

