package Zabawa;

public class Static {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Max");
        Friend friend2 = new Friend("Piotrek");
        Friend friend3 = new Friend("Oskar");
        System.out.println(friend1.name + " " + friend2.name + " " + friend3.name);
        Friend.showFriends();
    }
}
