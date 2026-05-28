package miniProgramy;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Timer timer = new Timer();
        int countdownNumber;

        System.out.print("Enter the number the countdown should start from: ");
        countdownNumber = scanner.nextInt();

        TimerTask countdown = new TimerTask() {
            int count = countdownNumber;

            @Override
            public void run() {
                System.out.println(count); 
                count--;

                if (count < 0) {
                    System.out.println("BOOM!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(countdown, 500, 1000);
        scanner.close();
    }
}