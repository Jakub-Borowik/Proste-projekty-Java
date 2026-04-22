package Zabawa;

public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(add(1, 3, 4));

        String pizza = bakePizza("Deep dish", "mozarella", "pepperoni");
        System.out.println(pizza);
        
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " pizza with " + cheese;
    }
    static String bakePizza(String bread, String cheese, String topping){
        return bread + " pizza with " + cheese + " and " + topping;
    }
}
