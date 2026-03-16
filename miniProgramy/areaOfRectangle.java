package miniProgramy;

import java.util.Locale;
import java.util.Scanner;

public class areaOfRectangle {

    public static void main(String[] Args) {
        // Initializations of variables
        double width = 0;
        double height = 0;
        double area = 0;

        // User input
        Scanner input = new Scanner(System.in);
        // Ta linijka wymusza czytanie kropek zamiast przecinków
        input.useLocale(Locale.US);

        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        height = input.nextDouble();

        input.close();

        // Calculations
        area = height * width;

        System.out.print("The area of this rectangle is: " + area);
    }
    
}
