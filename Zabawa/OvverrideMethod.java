package Zabawa;

public class OvverrideMethod {
    // Override is when a subclass has a method that ovverides the same method in parents class.
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        Cat1 cat = new Cat1();
        Fish fish = new Fish();

        fish.move();
        dog.move();
        cat.move();
    }
}
