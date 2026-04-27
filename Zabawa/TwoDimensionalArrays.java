package Zabawa;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"carrot", "spinach", "tomato"};
        String[] meats = {"fish", "beef", "chocken"};

        String[][] groceries = {{"apple", "orange", "banana"}, vegetables, meats};

        groceries[2][1] = "lamb"; // Row then column (↕ then ↔)

        for(String[] products : groceries){
            for(String product : products){
                System.out.print(product + " ");
            }
            System.out.println();
        }
        System.out.println(fruits);
    }
}
