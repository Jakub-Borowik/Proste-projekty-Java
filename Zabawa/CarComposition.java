package Zabawa;

public class CarComposition {
    String model;
    int year;
    Engine engine;

    CarComposition(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("Hello from " + this.model);
    }
}
