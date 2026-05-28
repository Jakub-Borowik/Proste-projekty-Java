package Zabawa;

import java.util.HashMap;

public class HasMapsExercise {
    // Efficently stores Key -> Value pairs. They are not in order and keyes have to be unique
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Manzana", 1.5);
        map.put("Avocado", 2.5);
        map.put("Toblerone", 3.25);
        map.put("Avocado", 12.0); // If you add the same key you overwrite the previous value associated to it.
        ///map.remove("Manzana");
        //System.out.println(map.get("Manzana"));
        //System.out.println(map.containsKey("Zgery"));

        if (map.containsKey("Manzana")) {
            System.out.println(map.get("Manzana"));
        } else {
            System.out.println("Key not found.");
        }

        System.out.println(map.containsValue(12.0));

        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
