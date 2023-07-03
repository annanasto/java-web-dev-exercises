package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        double numMiles = input.nextDouble();

        System.out.println("How much gas have you consumed in gallons:");
        double numGallons = input.nextDouble();
        input.close();

        double milesPerGallon = numMiles / numGallons;
        System.out.println("Your MPG is " + milesPerGallon);
    }
}
