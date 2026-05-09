package Zabawa.OOP;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Objects hold data (atributes) and can perform actions (methods). Data about the object is a reference type and iths held on the heap, to create an object you need a blueprint (class).
        CarClass myFavouriteCar = new CarClass();
        CarClass car = new CarClass();
        myFavouriteCar.year = 2025;
        myFavouriteCar.drive();
        myFavouriteCar.breake();
        car.drive();
    }
}
