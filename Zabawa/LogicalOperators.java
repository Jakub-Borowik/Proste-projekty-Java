package Zabawa;

public class LogicalOperators {
    public static void main(String[] Args) {

        double temp = 20;
        boolean isSnowing = false;
        boolean sunIsUp = true;

        // && - AND, mainly used to check multiple conditions - all conditions must be true
        if(temp <= 30 && temp >= 15){
            System.out.println("The weather is optimal");
        } else if(temp <= 5 || isSnowing){ // || - OR, at least one has to be true to output true
            System.out.println("Ho, ho, ho");
        } else if(!sunIsUp){ // ! - NEGGATION, used to return 0 when it should be 1 and vice versa.
            System.out.println("Good night");
        } else{
            System.out.println("i have no idea");
        }
    }
}
