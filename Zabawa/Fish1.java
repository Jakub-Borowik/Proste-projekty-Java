package Zabawa;

public class Fish1 implements Predator, Prey {
    @Override
    public void flee(){
        System.out.println("the fish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}
