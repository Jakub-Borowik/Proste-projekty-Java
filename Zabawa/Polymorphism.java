package Zabawa;

public class Polymorphism {
    // Objects can identify as parentclasses, useful in arrays.
    public static void main(String[] args) {
        CarPolymorphism car = new CarPolymorphism();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
