package Zabawa.OOP;

public class CarClass {
    String make = "Porsche";
    String model = "911";
    int year = 1999;
    double price = 59.999;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You turned off the engine");
    }
    void drive(){
        System.out.println("You drive the " + make + " " + model);
    }
    void breake(){
        isRunning = false;
        System.out.println("You break the " + make + " " + model);
    }
}
