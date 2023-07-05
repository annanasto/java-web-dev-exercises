package exercises.chapter2;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank, " +
                "and of having nothing to do: " +
                "once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        System.out.println("Enter a term to search for:");
        String searchTerm = input.next().toLowerCase();
        input.close();

        if (sentence.toLowerCase().contains(searchTerm)) {
            System.out.println("Found");

            int index = sentence.indexOf(searchTerm);
            int length = searchTerm.length();

            System.out.println("Your search term was first found at index "
                    + index + " and has a length of " + length + " characters.");

            String newSentence = sentence.replace(searchTerm, "");
            System.out.println(newSentence);
        } else {
            System.out.println("Not found");
        }
    }
}
