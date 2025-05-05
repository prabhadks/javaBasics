import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

    private String name;
    private int[] listOfMarks;

    public Student(String name, int[] listOfMarks) {
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(int[] listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    public int getNumberOfMarks() {
        return listOfMarks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : listOfMarks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        Arrays.sort(listOfMarks);
        return listOfMarks[listOfMarks.length - 1];
    }

    public int getMinimumMark() {
        Arrays.sort(listOfMarks);
        return listOfMarks[0];
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int marks = getNumberOfMarks();
        //When dividing for better accuracy when the result contains float. Suggest to use Bigdecimal.
        //In Bigdecimal use .divide instead of /. And precision should be mentioned and then whether rounding is expected Up or down
        return new BigDecimal(sum).divide(new BigDecimal(marks) ,3, RoundingMode.UP);
    }
}