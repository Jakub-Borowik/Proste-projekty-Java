package Zabawa;

public class Inheritance {
    // Classes can inherit attributes from other classes and also have their own attributes
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
