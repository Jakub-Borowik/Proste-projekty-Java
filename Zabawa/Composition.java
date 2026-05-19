package Zabawa;

public class Composition {
    public static void main(String[] args) {
        // An object can be a part of another object.

        CarComposition car = new CarComposition("Toyota Supra", 2024, "Turbocharged - Inline 4");
        car.start();
    }
}
