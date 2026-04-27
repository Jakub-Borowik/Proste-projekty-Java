package miniProgramy;

import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDices = 0;
        int total = 0;

        while(numberOfDices <= 0){
        System.out.print("Enter how many dices you want to roll: ");
        numberOfDices = scanner.nextInt();
        if(numberOfDices <= 0){
            System.out.println("Please enter a positive intiger.");
        }else{
            break;
            }
        }

        for(int i = numberOfDices; i > 0; i--){
            int roll = random.nextInt(1, 7);
            System.out.println("You rolled: " + roll);
            printDie(roll);
            total += roll;
        }
        System.out.println("Total: " + total);
        scanner.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("ERROR.");
        }
    }
}
