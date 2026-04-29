package miniProgramy;

import java.util.Scanner;
import java.util.Random;

public class GamblingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";
        double bet = 0;
        double balance = 200;
        double winAmount = 0;
        String[] row;

        System.out.println("*--------------------------------------------*");
        System.out.println("=================SLOT MACHINE=================");
        System.out.println("High value symbols:7️⃣  💎 🔔 🌟 👑 🍀 💰 💵");
        System.out.println("Standard value symbols:🍒 🍋 🍊 🍇 🍉 🍑 🍎");
        System.out.println("Low value symbols:♠️  ♥️  ♦️  ♣️");
        System.out.println("*--------------------------------------------*");

        while(balance > 0){
            System.out.println("\nCurrent balance: " + balance + " PLN");
            System.out.print("Place your bet: ");
            bet = scanner.nextDouble();
            if(bet > balance){
                System.out.println("\n==================");
                System.out.println("INSUFFICIENT FUNDS");
                System.out.println("==================");
                continue;
            }else if(bet <= 0){
                System.out.println("\n===============");
                System.out.println("Bet must be > 0");
                System.out.println("===============");
                continue;
            }else{
                balance -= bet;
            }
        }

        // Spin row + animation

        // Dispaly row

        // Get payout

        // Ask to play again

        // Display exit message
    }
}
