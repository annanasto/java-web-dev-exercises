package exercises.chapter3;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            someIntegers.add(i);
        }

        int evenIntegers = SumEvenNums.sumEven(someIntegers);
        System.out.println(someIntegers);
        System.out.println(evenIntegers);

    }
}
