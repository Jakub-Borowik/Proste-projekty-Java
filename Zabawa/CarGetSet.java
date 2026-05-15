package Zabawa;

public class CarGetSet {
    private String model;
    private String color;
    private int price;

    CarGetSet(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if (price < 0) {
            System.out.println("Price can't be negative.");
        } else {
            this.price = price;
        }
    }
}
