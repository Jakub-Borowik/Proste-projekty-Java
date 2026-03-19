package miniProgramy;

import java.util.Scanner;

public class pitagoras {

    public static void main(String[] Args) {

    // c^2 = a^2 + b^2

    double a;
    double b;
    double result;

    Scanner input = new Scanner(System.in);

    System.out.println("This is a Pythagorean theorem calculator.");
    
    System.out.print("Enter the side 'a' of a triangle: ");
    a = input.nextDouble();

    System.out.print("Enter the side 'b' of a triangle: ");
    b = input.nextDouble();

    result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("The hypotenuse ('c' side) is equal to: " + result + ".");


    input.close();
    }
}
