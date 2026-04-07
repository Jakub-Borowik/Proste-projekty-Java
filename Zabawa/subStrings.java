package Zabawa;

import java.util.Scanner;

public class subStrings {
    public static void main(String[] Args) {

        /* Old method, it doesnt work that well with strings of changeable length
        String email = "qbastar@gmail.com";
        String username = email.substring(0, 7); //endindex char is not in the substring value
        String domain = email.substring(8);

        System.out.println(username);
        */

        Scanner scanner = new Scanner(System.in);

        String username;
        String domain;
        String email;

        System.out.print("Enter your e-mail: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
           username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1); // Add ine to remove the @

        System.out.println(username);
        System.out.println(domain); 
        } else {
            System.out.println("You didn't provide an e-mail.");
        }

        scanner.close();
    }
    
}
