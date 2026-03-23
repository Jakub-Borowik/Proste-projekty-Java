package Zabawa;

public class printf {

    public static void main(String[] Args) {

        String name = "Jakub";
        char surnameFirstLetter = 'B';
        int age = 20;
        double height = 1.77;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name); // s - String
        System.out.printf("Your last name starts with a/an %c\n", surnameFirstLetter); // c - char
        System.out.printf("You are %d years old\n", age); // d - integer
        System.out.printf("You are %.2f meters tall\n", height); // f - double, .2 ile cyfr po przecinku zostanie wypisane
        System.out.printf("Employed: %b\n", isEmployed); // b - boolean

        System.out.printf("Hello %s %c, you are %d years old.", name, surnameFirstLetter, age);

    }
    
}
