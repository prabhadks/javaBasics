
import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArrayListOfMaps {

    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("firstName", "prabha");
        student1.put("lastName","Dodda");
        student1.put("language", "java");
        student1.put("grade", "A");

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("firstName", "prabha1");
        student2.put("lastName","Dodda1");
        student2.put("language", "java1");
        student2.put("grade", "B");

        HashMap<String, String> student3 = new HashMap<>();
        student3.put("firstName", "prabha1D");
        student3.put("lastName","Dodda1P");
        student3.put("language", "java12");
        student3.put("grade", "C");

        HashMap<String, String> student4 = new HashMap<>();
        student4.put("firstName", "prabhavathi");
        student4.put("lastName","D");
        student4.put("language", "j");
        student4.put("grade", "A");

        ArrayList<HashMap<String, String>> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        System.out.println("List of students with grade A");
        for (HashMap<String, String> student : studentsList) {
            if (student.get("grade").equals("A")) {
                System.out.print("first Name: " + student.get("firstName"));
                System.out.println(", last Name: " + student.get("lastName"));
            }
        }
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM dd yyyy, HH:mma");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(localTime);
        System.out.println(localTime.format(formatter));
    }
}
