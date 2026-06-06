package Zabawa;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RunnableExercise runnable = new RunnableExercise();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); // Daemon means that the thread will end as soon as the program ends.
        thread.start();
        
        System.out.println("You have 10 seconds to enter your name.");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Shalom " + name);

        scanner.close();
    }
}
