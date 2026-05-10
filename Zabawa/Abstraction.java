package Zabawa;

public class Abstraction {
    public static void main(String[] args) {
        // Abstract classes hide the implementation details and show only the important features. You cannot create objects from an abstract class.
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
