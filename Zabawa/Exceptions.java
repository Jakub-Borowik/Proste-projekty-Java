package Zabawa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // Events that interrupts our programmes, we can try, catch or finally them.

        try(Scanner scanner = new Scanner(System.in);){
        System.out.print("Entrer a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number");
        }
        catch(Exception e){
            // Acts like a safety net - user doesn't know what went wrong
            System.out.println("Something went wrong");
        }
        finally{
            // This always executes - if the scanner was created outside the try, you have to close it here, but if its in try Java automatically closes it for you.
        }
    }
}
