package Zabawa;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        /*
        String name = "";
        
        // While - repeats until the condition is true, not like if that just checks once.
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        */

        String response = "";

        while(!response.equals("Q")){
            System.out.print("Guess the character to quit: ");
            response = scanner.nextLine();
        }

        System.out.println("You guessed!");

        scanner.close();
    }
}
