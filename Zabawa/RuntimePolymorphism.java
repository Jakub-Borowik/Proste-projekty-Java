package Zabawa;

import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        AnimalPolymorphism animal;
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like a dog or a cat? (1 = Dog, 2 = Cat): ");
        choice = scanner.nextInt();

        if(choice == 1){
            animal = new DogPolymorphism();
            animal.speak();
        } else if(choice == 2){
            animal = new CatPolymorphism();
            animal.speak();
        }
        scanner.close();
    }
}
