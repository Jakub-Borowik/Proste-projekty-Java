package Zabawa;

public class ToString {
    // Overrides the original toString method that would provide hash codes, with our own that can returnt the object details.
    public static void main(String[] args) {
        Car1 car1 = new Car1("Ford", "Mustang", 2025, "Red");
        Car1 car2 = new Car1("Dodge", "Charger", 2019, "Yellow");

        System.out.println(car1);
        System.out.println(car2);
    }
}
