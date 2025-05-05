public class CompareArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,32,1,4};
        System.out.println("Are sum of arrays equal: "+areSumsEqual(array1, array2));
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for(int value: array) {
            sum +=value;
        }
        return sum;
    }

    public static boolean areSumsEqual(int[] array1, int[] array2){
        return calculateSum(array1) == calculateSum(array2);
    }
}
