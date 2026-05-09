package Zabawa;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "red");
        Car car2 = new Car("Audi", "black");
        Car car3 = new Car("BMW", "silver");

        Car[] cars = {car1, car2, car3, new Car("Dodge", "yellow")};

        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
            
        }

        for(Car car : cars){
            car.color = "black";
            car.drive();
        }
    }
}
