package Zabawa;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Grape", "Banana", "Pineaple"};
        fruits[0] = "Mango";

        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        Arrays.sort(fruits); // arranges alphabetically or in ascending order
        Arrays.fill(fruits, "Mango"); // Changes all the values

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        // Enhanced for loop - for each
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
