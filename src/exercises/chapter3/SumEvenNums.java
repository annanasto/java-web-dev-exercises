package exercises.chapter3;

import java.util.ArrayList;

public class SumEvenNums {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int number: arr) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }
}
