package Zabawa;

public class stringMethod {
    public static void main(String[] Args) {

        String name = "Jakub Borno";
        String upperName;
        String lowerName;

        int length = name.length();
        char letter = name.charAt(0); // Prints out a char at picked index
        int index = name.indexOf("a"); // Prints out the index of the first matching char
        int lastIndex = name.lastIndexOf("b"); // Prints out the last index of a matched char
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        
        upperName = name.toUpperCase();
        System.out.println(upperName);
        lowerName = name.toLowerCase();
        System.out.println(lowerName);
        name = name.trim(); // Removes /s from before and after chars (not spaces)
        name = name.replace("o", "a"); // target then replacement
        // Ignore case - doesnt care if the letter is upper or lower case
    }
}
