package Zabawa;

public class Car1 {
    String make;
    String model;
    int year;
    String color;

    Car1(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
