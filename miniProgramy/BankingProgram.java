package miniProgramy;
import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        double amount;
        int option;
        boolean exit = false;
      
        while(exit == false){
        System.out.println("====================");
        System.out.println("1. Check my balance");
        System.out.println("2. Depsoit");
        System.out.println("3. Withdraw");
        System.out.println("4. EXIT");
        System.out.println("====================");
        option = scanner.nextInt();

        switch(option){
            case 1 -> {
                System.out.println("********************");
                System.out.println("Your balance is: " + checkhbalance(balance) + "PLN");
                System.out.println("********************");
            }
            case 2 -> {
                System.out.print("Amount to deposit: ");
                amount = scanner.nextDouble();
                balance = deposit(balance, amount);
                System.out.println("Thank you for cooperating, waiting for confiramtion from your bank.");
                Thread.sleep(1000);
                System.out.println("********************");
                System.out.println("All set, have a nice day.");
                System.out.println("********************");
            }
            case 3 -> {
                System.out.print("Amount to withdraw: ");
                amount = scanner.nextDouble();
                System.out.println("Thank you for cooperating, waiting for confiramtion from your bank.");
                Thread.sleep(1000);
                if(balance < amount){
                    System.out.println("********************");
                    System.out.println("You don't have enough funds.");
                    System.out.println("********************");
                }else{
                    balance = withdraw(balance, amount);
                    System.out.println("********************");
                    System.out.println("All set, have a nice day.");
                    System.out.println("********************");
                }
            }
            case 4 -> {
                System.out.println("********************");
                System.out.println("Have a nice day.");
                System.out.println("********************");
                exit = true;
            }
            default -> {
                System.out.println("********************");
                System.out.println("Invalid choice.");
                System.out.println("********************");
            }
        }
    }
        scanner.close();
    }
    static double checkhbalance(double balance){
        return balance;
    }
    static double deposit(double balance, double amount){
        return balance = amount + balance;
    }
    static double withdraw(double balance, double amount){
        return balance = balance - amount;
    }
}
