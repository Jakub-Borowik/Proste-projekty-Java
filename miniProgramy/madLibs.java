package miniProgramy;

import java.util.Scanner;

public class madLibs {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        // Variables

        // Describes sth.
        String adjective1;
        String adjective2;
        // Person, place or thing
        String noun1;
        String noun2;
        String noun3;
        // Action 
        String verb1;
        String verb2;

        // User Input
        System.out.print("Enter an adjective (funny, green): ");
        adjective1 = input.nextLine();
        System.out.print("Enter a noun (desk, car etc.): ");
        noun1 = input.nextLine();
        System.out.print("Enter a verb (run, eat etc.): ");
        verb1 = input.nextLine();
        System.out.print("Enter a noun (desk, car etc.): ");
        noun2 = input.nextLine();
        System.out.print("Enter an adjective (funny, green): ");
        adjective2 = input.nextLine();
        System.out.print("Enter a noun (desk, car etc.): ");
        noun3 = input.nextLine();
        System.out.print("Enter a verb ending with -ing (running, eating etc.): ");
        verb2 = input.nextLine();


        // Story
        System.out.println("Yesterday my " + adjective1 + " car got stolen.");
        System.out.println("I went to the " + noun1 + " to file a report, the moment they told me the bad news I just couldn't help myself but to " + verb1 + ".");
        System.out.println("Sadly, I went to grab some ice cream when a " + noun2 + " told me to follow my dreams.");
        System.out.println("With new hope I went to buy a lottery ticket, and won a " + adjective2 + " " + noun3 + ".");
        System.out.println("And then I woke up from a dream... I got up the bed and started " + verb2 + ".");
      
        input.close();
    }
    
}
