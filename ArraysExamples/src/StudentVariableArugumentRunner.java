public class StudentVariableArugumentRunner {
    public static void main(String[] args){
        //variable argument in the list of marks. The integer array size is not defined. its variable. Represented as ...
        StudentVariableArgument student = new StudentVariableArgument("Test Student", 35, 65, 87, 99, 100, 80);
        System.out.println("Get Number of Marks of Student: "+ student.getNumberOfMarks());
        System.out.println("Get Total Sum Of Marks: "+ student.getTotalSumOfMarks());
        System.out.println("Get Maximum Mark: " + student.getMaximumMark());
        System.out.println("Get Minimum Mark: " + student.getMinimumMark());
        System.out.println("Get Average Marks: " + student.getAverageMarks());

        StudentVariableArgument student1 = new StudentVariableArgument("Test Student", 99, 100, 80);
        System.out.println("Get Number of Marks of Student: "+ student1.getNumberOfMarks());
        System.out.println("Get Total Sum Of Marks: "+ student1.getTotalSumOfMarks());
        System.out.println("Get Maximum Mark: " + student1.getMaximumMark());
        System.out.println("Get Minimum Mark: " + student1.getMinimumMark());
        System.out.println("Get Average Marks: " + student1.getAverageMarks());
    }
}
