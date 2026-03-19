package Zabawa;

import java.util.Random;

public class randomNumbers {
    public static void main(String[] Args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number4;

        number1 = random.nextInt(1, 7); // to działa jak 1<= x < 6, więc jak chcemy od 1 do 6 to trzeba ustawić w bound 7.
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);
        number4 = random.nextDouble(1, 7);
        System.out.println(number1 + ", " + number2 + ", " + number3 + ", double: " + number4 + ".");
    
        // Coin toss

        System.out.println("=== COIN TOSS ===");

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
    }
    
}
