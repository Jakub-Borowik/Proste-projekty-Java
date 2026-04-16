package miniProgramy;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] Args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int randomNumber = random.nextInt(1,101);
        boolean won = false;

        System.out.println("=== 🍒HIGHER OR LOWER🍒 ===");
        System.out.println("Try and guess the number between 1-100.");
        
        for(int i = 15; i > 0; i--){
        System.out.println("You have got " + i + " tries left.");
        System.out.print("Guess the number: ");
        guess = scanner.nextInt();

        if(guess == randomNumber){
            System.out.println("YOU WON!");
            won = true;
            break;
        }else if(guess>randomNumber && i > 1){
            System.out.println("LOWER!");
        }else if(guess<randomNumber && i > 1){
            System.out.println("HIGHER!");
        }
        }
        if(!won){
            System.out.println("YOU LOST!");
        }
        scanner.close();
    }
}
