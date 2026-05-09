package Zabawa.OOP;

public class OverloadedConstructors {
    public static void main(String[] args) {
        // Same as overloaded methods, copule of the same constructor with different parameter lists.
        User user1= new User("Zgerman123");
        User user2 = new User("Oskar", "mango@gmail.com");
        User user3 = new User("Jakub", "jaqb@wp.pl", 21);
        User gość = new User();

        System.out.println(user1.username + "\n" + user1.email + "\n" + user1.age + "\n");
        System.out.println(user2.username + "\n" + user2.email + "\n" + user2.age + "\n");
        System.out.println(user3.username + "\n" + user3.email + "\n" + user3.age + "\n");
        System.out.println(gość.username + "\n" + gość.email + "\n" + gość.age + "\n");
    }
}
