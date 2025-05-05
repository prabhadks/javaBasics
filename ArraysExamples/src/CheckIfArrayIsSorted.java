public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] array2 = {5,4,32,1,4};
        int[] array1 = {1,2,3,4,5};
        System.out.println("Are the elements in array sorted: "+ isSorted(array2));
        System.out.println("Are the elements in array sorted: "+ isSorted(array1));
    }

    public static boolean isSorted(int[] array) {
        if(array.length > 1) {
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
