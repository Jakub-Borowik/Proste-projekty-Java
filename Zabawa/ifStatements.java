package Zabawa;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        int age;
        String name;
        boolean hasSwag;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        System.out.print("Do you have $wag? (true/false): ");
        hasSwag = input.nextBoolean();


        // Name
        if(name.isEmpty()) {
            System.out.println("You didn't enter your name 🤔");
        }
        else {
            System.out.println("Hello " + name);
        }

        // Age
        if(age == 67) {
            System.out.println("Nice bro, nice");
        }
        else if(age >= 65) {
            System.out.println("You are a senior");
        }
        else if(age >= 18) {
            System.out.println("You are an adult");
        }
        else if(age < 0) {
            System.out.println("You aren't real");
        }
         else if(age == 0) {
            System.out.println("Lil bro missed everything 🥀");
        }
        else {
            System.out.println("You are a child");
        }

        // Swag
        if(hasSwag) {
            System.out.println("Respect");
        }
        else {
            System.out.println("Bro... 😭");
        }
        input.close();
    }

}
