package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i: integerArray) {
            System.out.println(i);
        }

        // Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for (int i: integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] wordArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordArray));

        String[] sentenceArray = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
