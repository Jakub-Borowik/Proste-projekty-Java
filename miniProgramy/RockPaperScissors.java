package miniProgramy;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice = "";
        String playAgain = "yes";

        while(playAgain.equals("yes")){
        System.out.print("Enter your move: ");
        playerChoice = scanner.nextLine().toLowerCase();
        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Enter a viable choice (rock, paper, scissors).");
            continue;
        }
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computers' choice: " + computerChoice);
        

        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }else if(playerChoice.equals("rock") && computerChoice.equals("scissors") || playerChoice.equals("paper") && computerChoice.equals("rock") || playerChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You won!");
        }else{
            System.out.println("You lost!");
        }

        playAgain = "";
        while(!playAgain.equals("yes") && !playAgain.equals("no")){
        System.out.print("Do you want to play again (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();
        }
    }
    System.out.println("Thanks for playing!");
        scanner.close();
    }
}
