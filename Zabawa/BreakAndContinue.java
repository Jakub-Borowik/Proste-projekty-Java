package Zabawa;

public class BreakAndContinue {
    public static void main(String[] Args){
        // break - leaves the loop when it reaches the breakpoint
        // continue - acts as a skip
        
        for(int i = 10; i > 0; i--){

            if(i==5){
                break;
            }
            System.out.println(i);
        }

        System.out.println("=== NEXT SECTION ===");

        for(int i = 10; i > 0; i--){

            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
