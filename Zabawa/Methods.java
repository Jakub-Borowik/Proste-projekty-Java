package Zabawa;

public class Methods {
    public static void main(String[] args) {
        // method - reusable code, requires calling it

        String name = "Jakub";
        int age = 21;

        for(int i = 0; i < 2; i++){
        trainingPlan(name, age); // These are arguments, the ones at the top of themethod are called parameters
        }

        double result = square(3);
        System.out.println(result);
        System.out.println(square(2));

        System.out.println(cube(2));

        String fullName = getFullName("Zgery", "pałka");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You can drink beer");
        }
        else{
            System.out.println("Sorry jit, not yet");
        }

    }
    // Names of parameters can differ from the names of arguments, the data type is important, can't be wrong
    static void trainingPlan(String name, int ageFromMain){
        System.out.println("3 sets of lateral pulldowns, the last one till failure");
        System.out.println("2 sets of dumbell bench press, the last set with RIR 2");
        System.out.println("4 sets of tomfoolery and inconvenience, till failure");
        System.out.println("2 sets of cable lateral raises, behind the back");
        System.out.printf("My name is %s and I'm %d years old, I love to train!\n", name, ageFromMain);
    }
   
    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return Math.pow(number, 3);
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
            else{
                return false;
            }
        
    }
}
