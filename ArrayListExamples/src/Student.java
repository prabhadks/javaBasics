import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

    public Student(String name, int[] listOfMarks) {
        this.name = name;
        //Adding the marks from array to array list
        for (int mark: listOfMarks) {
            this.listOfMarks.add(mark);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(ArrayList<Integer> listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    public int getNumberOfMarks() {
        return listOfMarks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : listOfMarks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maximumMark = Integer.MIN_VALUE;
        for (int mark: listOfMarks) {
            if(mark > maximumMark) {
                maximumMark = mark;
            }
        }
        return maximumMark;
    }

    public int getMinimumMark() {
        int minMark = Integer.MAX_VALUE;
        for (int mark: listOfMarks) {
            if(mark < minMark) {
                minMark = mark;
            }
        }
        return minMark;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int marks = getNumberOfMarks();
        //When dividing for better accuracy when the result contains float. Suggest to use Bigdecimal.
        //In Bigdecimal use .divide instead of /. And precision should be mentioned and then whether rounding is expected Up or down
        return new BigDecimal(sum).divide(new BigDecimal(marks) ,3, RoundingMode.UP);
    }

    public void addNewMark(int value) {
        listOfMarks.add(value);
    }

    public String toString() {
        return this.name + this.listOfMarks;
    }
}