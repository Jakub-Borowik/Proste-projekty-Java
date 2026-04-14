package Zabawa;

public class EnhancedSwitches {
    public static void main(String[] Args) {
        // Minimizes the space instead of using lots of else ifs'.

        String day = "Zgeryday";

        switch(day) {
            case "Monday" -> System.out.println("It's time to work");
            case "Tuesday" -> System.out.println("Work, work, work...");
            case "Wednesday" -> System.out.println("If you got a job I'm sorry for you");
            case "Thursday" -> System.out.println("Go to work, just go to work");
            case "Friday" -> System.out.println("It's almost over bro");
            
            case "Saturday", "Sunday" -> System.out.println("Freedom");
            
            default -> System.out.println(day + " is not a day of the week");
        }
    }
}
