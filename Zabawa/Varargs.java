package Zabawa;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
        System.out.println(average());
    }
    static double add(double... numbers){
        double sum = 0;

        for(double number : numbers){
            sum += number;
        }
        return sum;
    }
    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
