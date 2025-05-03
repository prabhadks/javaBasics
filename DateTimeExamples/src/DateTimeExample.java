import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Get the day of month of today:" + today.getDayOfMonth());
        System.out.println("Get the month of today's date:" + today.getMonth());
        System.out.println("Get the day of week of today's date:" + today.getDayOfWeek());
        System.out.println("Get the day of year of today's date:" + today.getDayOfYear());
        System.out.println("Get the day after 5 days from today's date:" + today.plusDays(5));
        System.out.println("Get the month prior to today's date:" + today.minusMonths(3));
        System.out.println("Get the year of today's date:" + today.getYear());
        LocalDate newDate = today.plusWeeks(15);
        System.out.println("New Date after 15 weeks: " + newDate);
        //compareTo() compares the year, month, and day, in that order. First year is compared. Both are 2025 then ignored.
        //now moves to month, today is 5, new date is 8, hence -3 is output. If month is also same, then date is compared.
        System.out.println("Difference between dates: "+ today +" and " + " newDate is " +today.compareTo(newDate));
        System.out.println("Using isBefore: "+ newDate.isBefore(today));
        System.out.println("Using isAfter: "+ newDate.isAfter(today));
        System.out.println("Is Leapyear: "+ newDate.isLeapYear());
        System.out.println("Local Date Time value: "+ LocalDateTime.now());
        System.out.println("Local Time value: "+ LocalTime.now());
    }
}
