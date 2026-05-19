package Zabawa;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // Resizable array of OBJECTS.
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        //fruits.remove("Apple");
        //fruits.remove(3);

        //fruits.set(1, "Orange");

        //System.out.println(fruits.get(1));
        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
