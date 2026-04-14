package miniProgramy;

import java.util.Scanner;

public class tempConverter {
    public static void main(String[] Args) {
        
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temperature  = scanner.nextDouble();
    
        while(true) {
        System.out.print("Convert to Fahrenheit or Celcius (C or F): ");
        unit = scanner.next().toUpperCase();

        if(unit.equals("C") || unit.equals("F")) {
            break;
        }
        System.out.println("Pick a correct temperature system.");
        }
        
    newTemp = (unit.equals("C")) ? (temperature - 32) * 5.0/9.0 : (temperature * 9.0/5.0) + 32;
        
        System.out.printf("Your temperature converted to %s, equals: %.2f", unit, newTemp);
        
        scanner.close();
    }
}
