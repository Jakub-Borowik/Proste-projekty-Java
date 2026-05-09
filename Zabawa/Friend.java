package Zabawa;

public class Friend {
    // Static makes the variable makes all the objects share one attribute rather than creating a copy
    static int numOfFriends;
    String name;

    Friend(String name){
       this.name = name; 
       numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }
}
