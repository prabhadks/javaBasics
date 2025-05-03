public class StringArrayExample {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Week with Most letters: "+ getWeekDayWithMostLetters(daysOfWeek));
        printDaysOfWeekFromBackwards(daysOfWeek);
    }

    public static int getWeekDayWithMostLetters(String[] daysOfWeek) {
        int maxLetters = Integer.MIN_VALUE;
        String week = null;
        for (String dayOfWeek:daysOfWeek) {
            if(dayOfWeek.length() > maxLetters) {
                maxLetters = dayOfWeek.length();
                week = dayOfWeek;
            }
        }
        System.out.println(week);
        return maxLetters;
    }

    public static void printDaysOfWeekFromBackwards(String[] daysOfWeek) {
        for(int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }
    }
}
