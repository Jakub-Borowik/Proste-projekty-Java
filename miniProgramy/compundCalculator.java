package miniProgramy;

import java.util.Scanner;

public class compundCalculator {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        double principalAmmount; // Initial investment
        double rate; // %
        int coumpoundsPerYear;
        int years;
        double finalAmount; // Final sum
        double interest; // Final amount - Initial Investment

        System.out.print("Enter the principal amount: ");
        principalAmmount = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = input.nextDouble() / 100; // Dividing to get 0.xx from %

        System.out.print("Enter the number of times coumpounded per year: ");
        coumpoundsPerYear = input.nextInt();

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        finalAmount = principalAmmount * Math.pow(1 + rate / coumpoundsPerYear, coumpoundsPerYear * years);
        interest = finalAmount - principalAmmount;

        System.out.println("The amount after " + years + " years is equal to: " + finalAmount);
        System.out.printf("The interest is equals to: %.2f", interest);

        input.close();
    }
}
