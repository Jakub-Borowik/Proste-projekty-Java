package Zabawa;

public class RunnableExercise implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted.");
            }
            if (i == 10) {
                System.out.println("\nTimes up!");
                System.exit(0);
            }
        }
    }
}
