package miniProgramy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] Args) {

        double numberOne;
        double numberTwo;
        char operation;
        double result = 0;
        boolean validOperation = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULATOR ===");
        System.out.print("Enter the first number: ");
        numberOne = scanner.nextDouble();

        System.out.print("Pick the operation (*,/,+,-,^,%): ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        numberTwo = scanner.nextDouble();

        // === The calculations ===

        switch(operation) {
            case '*' -> result = numberOne * numberTwo;
            case '/' -> { if(numberTwo == 0) {
                System.out.println("You can't divide by zero.");
                validOperation = false;
            } else {
                result = numberOne / numberTwo;
                }
            }
            case '+' -> result = numberOne + numberTwo;
            case '^' -> result = Math.pow(numberOne, numberTwo);
            case '%' -> result = numberOne % numberTwo;
            default -> {
                System.out.println("The operator you picked is invalid.");
                validOperation = false;
            }
        }

        if(validOperation) {
        System.out.println(result);
        }
        scanner.close();
    }
}
