public class StudentRunner {

    public static void main(String[] args) {
        int[] marks = {35, 65, 87, 99, 100, 80};
        Student student = new Student("Test Student", marks);
        System.out.println("Get Number of Marks of Student: "+ student.getNumberOfMarks());
        System.out.println("Get Total Sum Of Marks: "+ student.getTotalSumOfMarks());
        System.out.println("Get Maximum Mark: " + student.getMaximumMark());
        System.out.println("Get Minimum Mark: " + student.getMinimumMark());
        System.out.println("Get Average Marks: " + student.getAverageMarks());
    }
}
