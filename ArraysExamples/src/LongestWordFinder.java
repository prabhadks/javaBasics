import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String input = scanner.nextLine();
        System.out.println("Longest Word in the given sentence: ");
        System.out.println(findLongestWord(input));
    }

    public static String findLongestWord(String input) {
        if(input.isEmpty()){
            return "";
        }
        String actualInput = input.trim();
       String[] numberOfWords = actualInput.split(" ");
        String maxWord = "";
        for (String word: numberOfWords) {
                if(word.length() > maxWord.length()) {
                    maxWord = word;
                }
            }
        return maxWord;
    }
}
