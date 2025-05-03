import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class AccessElementsFromArrayUsingLoops {
    public static void main(String[] args){
        int[] marks = {10,20,30,40,50,60,70,55};
        //approach1 using traditional for
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("__________________________________");
        //approach 2 using enhanced for loop
        for (int mark: marks) {
            System.out.println(mark);
        }
        System.out.println("Content of an array:" + Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println("Sorted array: " + Arrays.toString(marks));
        //If want to fill a default value as 100 for all elements in an array
        Arrays.fill(marks,100);
        System.out.println("Content of an array: "+ Arrays.toString(marks));
        int[] marks1 = new int[8];
        Arrays.fill(marks1, 100);
        int[] marks2 = new int[8];
        Arrays.fill(marks2, 50);
        int[] marks3 = new int[4];
        Arrays.fill(marks1, 100);
        System.out.println("Comparing arrays: "+ Arrays.compare(marks, marks1));
        System.out.println("Comparing arrays: "+ Arrays.compare(marks, marks2));
        System.out.println("Comparing arrays: "+ Arrays.compare(marks, marks3));
    }
}
