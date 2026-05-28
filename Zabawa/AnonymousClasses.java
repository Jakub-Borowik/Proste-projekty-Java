package Zabawa;

public class AnonymousClasses {
    public static void main(String[] args) {
        DogAnonymous dog1 = new DogAnonymous();
        DogAnonymous dog2 = new DogAnonymous(){
            @Override
            void speak(){
                System.out.println("I can talk, I'm aware of the tax frauds you have commited.");
            }
        };
        dog1.speak();
        dog2.speak();
    }
}
