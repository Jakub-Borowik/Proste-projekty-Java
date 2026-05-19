package Zabawa;

public class WrapperClasses {
    public static void main(String[] args) {
        // Can turn primitive values such as integers, doubles, booleans, Strings etc. into objects.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean v = d;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(v);

        String ab = Integer.toString(123);
        String bc = Double.toString(3.14);
        String cd = Character.toString('$');
        String de = Boolean.toString(true);

        String xy = ab + bc + cd + de;
        System.out.println(xy);

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
