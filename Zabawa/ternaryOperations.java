package Zabawa;

public class ternaryOperations {
    public static void main(String[] Args) {

        int score = 55;
        /* 
        Method one.

        if(score >= 60){
            System.out.println("Passed the test");
        }else{
            System.out.println("Failed the test");
        }
            */

        // Better method
        String passOrFail = (score >= 60) ? "Passed" : "Failed";

        System.out.println(passOrFail);

        // Even or Odd
        int number = 3;
        
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

    }
}
