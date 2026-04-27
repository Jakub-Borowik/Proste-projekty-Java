package Zabawa;

import java.util.Scanner;

public class SearchingStringArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "mango", "grape", "pineapple", "pear", "kiwi", "orange", "lemon"};
        boolean isFound = false;
        String target;

        System.out.print("Enter the target: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length ; i++){
           if(target.equalsIgnoreCase(fruits[i])){
            System.out.println("Target found at index: " + i);
            isFound = true;
            break;
           }
        }
           if(!isFound){
            System.out.println("Target not found in the array.");
           }
        scanner.close();
    }
}
