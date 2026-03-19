package miniProgramy;

import java.util.Scanner;

public class circle {
    
    public static void main(String[] Args) {

        // Calculating the circumference and area of a circle. + The volume of a sphere with the same radius.

        Scanner input = new Scanner(System.in);
        
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("=== ANSWERS ===");
        System.out.println("The circumfrence is equal to: " + circumference + ".");
        System.out.println("The area is equal to: " + area + ".");
        System.out.println("The volume is equal to: " + volume + ".");

        input.close();
    }
    
}
