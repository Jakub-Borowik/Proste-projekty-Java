package Zabawa;

public class GenericsExercise {
    // You can create methods, classes, interfaces that can work with different data types.
    public static void main(String[] args) {
        BoxGenerics<Integer> box = new BoxGenerics<>();
        ProductGenerics<String, Double> product1 = new ProductGenerics<>("apple", 0.5);
        ProductGenerics<String, Integer> product2 = new ProductGenerics<>("Pears", 12);

        box.setItem(45);
        System.out.println(box.getItem());

        System.out.println(product1.getItem());
        System.out.println(product2.getPrice());

    }
}
