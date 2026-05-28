package Zabawa;

import java.util.Timer;
import java.util.TimerTask;

public class Timers {
    public static void main(String[] args) {
        // Useful for sending notifications, and repetetive actions.
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000); // Task, first delay, interval length
    }
}
