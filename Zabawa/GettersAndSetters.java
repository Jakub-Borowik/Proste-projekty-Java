package Zabawa;

public class GettersAndSetters {
    public static void main(String[] args) {
        // Getters - make a field readable, Setters - make a field writeable.
        CarGetSet car = new CarGetSet("Charger", "Black", 250000);

        car.setColor("Red");
        car.setPrice(-90);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
