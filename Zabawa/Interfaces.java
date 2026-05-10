package Zabawa;

public class Interfaces {
    public static void main(String[] args) {
        // A class can implement multiple interfaces unlike abstract classes.
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish1 fish = new Fish1();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
