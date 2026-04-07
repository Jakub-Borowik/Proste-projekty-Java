package miniProgramy;

import java.util.Scanner;

public class weightConverter {
    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        int system;

        System.out.print("Choose a system (1. metric to imperial 2. imperial to metric): ");
        system = scanner.nextInt();

        System.out.print("Provide the weight: ");
        weight = scanner.nextDouble();

        if (system == 1) {
            weight = weight * 2.2046;
            System.out.printf("Your weight in lbs is: %.2f", weight);
        } else if (system == 2) {
            weight = weight * 0.4536;
            System.out.printf("Your weight in kgs is: %.2f", weight);
        } else {
            System.out.println("Pick between option 1 and 2 (use numbers).");
        }

        scanner.close();
    }
    
}
