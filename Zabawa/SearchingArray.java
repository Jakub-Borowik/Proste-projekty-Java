package Zabawa;

public class SearchingArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 4, 3, 1, 23, 44, 67};
        int target = 7;
        boolean isFound = false;

        for(int i = 0; i < numbers.length ; i++){
           if(target == numbers[i]){
            System.out.println("Target found at index: " + i);
            isFound = true;
            break;
           }
        }
           if(!isFound){
            System.out.println("Target not found in the array.");
           }
    
    }
}
