package Zabawa;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        /*  Przy klikaniu Enter w buferze pozostaje \n co scanner może wyłapać ajko input w kolejnym zapytaniu, aby tego sie pozbyc
        należy dodać inpu.nextLine(); bez prypisania aby pozbylo sie tego znaku. */
        Scanner input = new Scanner(System.in);
        char kropka = '.';
        char wykrzyknik = '!';

        System.out.print("Czego potrzebujesz? ");
        // next bez Line wyczytuje input do pierwszej spacji.
        String potrzeba = input.nextLine();
        
        System.out.print("Ile tego potrzebujesz? ");
        int ilosc = input.nextInt();

        System.out.print("Ile masz wzrostu (m)? ");
        double wzrost = input.nextDouble();

        System.out.println("Potrzebuje " + ilosc + " " + potrzeba + kropka);

        if(wzrost < 1.80) {
            System.out.println("Nie dostaniesz tego karle" + wykrzyknik);
        }
        else {
          System.out.println("Nie ma problemu mordeczko" + wykrzyknik);  
        }

        if(wzrost < 1.80){
            System.out.print("Czy jesteś MTN+ (true/false)? ");
        boolean lm = input.nextBoolean();
        
            if(lm & wzrost < 1.80) {
                System.out.println("Przepraszam mordeczko, proszę podam ci to z tej wysokiej półki" + wykrzyknik);
            }
            else {
                System.out.print("Nie ma ratunku mały bracie :(");
            }
        }

        input.close();
    }
}