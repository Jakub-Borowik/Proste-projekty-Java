package Zabawa;

public class math {
    public static void main(String [] Args) {

        // System.out.println(Math.PI); // Wypisuje wartość PI
        // System.out.println(Math.E); // Eulera
    
        double result;

        result = Math.pow(3, 2.5); // Power - pierwsze to liczba, drugie to potęga
        result = Math.abs(-5); // Bezwzglednosc
        result = Math.sqrt(9); // Pierwiastek drugiego stopnia
        result = Math.round(3.14); //Zaokraglanie do najlbizszej cyfry
        result = Math.ceil(Math.PI); // Zaokragla do gory
        result = Math.floor(3.75); // Zaokraglenie w dol
        result = Math.max(15, 30); // Wypisuje najwieksza z dwoch liczb
        result = Math.min(15, 30); // Wypisuje najmniejsza z dwoch liczb
        System.out.println(result);
    }
    
}
