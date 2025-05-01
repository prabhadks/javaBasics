public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number < 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public void printANumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
    public int calculateFactorial() {
        // Write your code here
        //4! = 4 * 3 * 2 * 1
        //0! = 1
        //<0 return -1
        int product = 1;
        if(number == 0 || number == 1) {
            return product;
        }
        if(number > 1) {
            for(int i = number; i > 1; i--) {
                product = product * i;
            }
            return product;
        }
        return -1;
    }
}
