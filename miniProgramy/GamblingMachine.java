package miniProgramy;

import java.util.Scanner;
import java.util.Random;

public class GamblingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playAgain = "yes";
        double bet = 0;
        double balance = 200;
        double payOut = 0;
        String[] row;

        System.out.println("*----------------------------------------------------------------*");
        System.out.println("================================SLOT MACHINE======================");
        System.out.println("Symbols:7️⃣  💎 👑 🍀 💰 ♠️  ♥️  ♦️  ♣️  🍒 🍋 🍇 🍉");
        System.out.println("*----------------------------------------------------------------*");

        while(balance > 0){
            System.out.println("\nCurrent balance: " + balance + " PLN");
            System.out.print("Place your bet: ");
            bet = scanner.nextDouble();
            scanner.nextLine();
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
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payOut = getPayout(row, bet);

            if(payOut > 0){
                System.out.println("You win: " + payOut + " PLN");
                balance += payOut;
            }else{
                System.out.println("Better luck next time...");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("yes")){
                break;
            }
        }

        System.out.println("Thanks for playing!");
        System.out.println("Your final payout is: " + balance);
        scanner.close();
    }
    static String[] spinRow(){
        String[] symbols = {"7️⃣", "💎", "👑", "🍀", "💰", "♠️", "♥️", "♦️", "♣️", "🍒", "🍋", "🍇", "🍉"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0 ; i < 3 ; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        
        return row;
    }
    static void printRow(String[] row){
        System.out.println("*-------------*");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*-------------*");
    }
    static double getPayout(String[] row, double bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "7️⃣" -> bet * 2000;
                case "💎" -> bet * 1000;
                case "👑" -> bet * 750;
                case "🍀" -> bet * 500;
                case "💰" -> bet * 250;
                case "🍒" -> bet * 200;
                case "🍋" -> bet * 150;
                case "🍇" -> bet * 100;
                case "🍉" -> bet * 75;
                case "♥️" -> bet * 50;
                case "♠️" -> bet * 25;
                case "♣️" -> bet * 10;
                case "♦️" -> bet * 5;
                default -> 0;
            };
        }

        if(row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])){
            return switch(row[0]){
                case "7️⃣" -> bet * 500;
                case "💎" -> bet * 400;
                case "👑" -> bet * 300;
                case "🍀" -> bet * 200;
                case "💰" -> bet * 100;
                case "🍒" -> bet * 50;
                case "🍋" -> bet * 25;
                case "🍇" -> bet * 10;
                case "🍉" -> bet * 5;
                case "♥️" -> bet * 4;
                case "♠️" -> bet * 3;
                case "♣️" -> bet * 2;
                case "♦️" -> bet * 1.5;
                default -> 0;
            };
        }

        return 0;
    }
}

