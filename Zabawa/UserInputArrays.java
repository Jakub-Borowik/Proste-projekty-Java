package Zabawa;

import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        String[] cars;

        System.out.print("How many cars would you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        cars = new String[size];

        for(int i = 0; i < cars.length; i++){
            System.out.print("Enter a car: ");
        cars[i] = scanner.nextLine();
        }

        for(String car : cars){
            System.out.print(car + " ");
        }
        scanner.close();
    }
}
