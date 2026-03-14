package Zabawa;

public class mlecznySklep {
    public static void main(String[] args) {
        int ileMleka = 40;
        double cena = 5.99;
        char kropka ='.';
        char wykrzyknik = '!';
        boolean czyPrzecena = false;
        String imie = "Ryszard";

        System.out.println("Witam w moim sklepie, mam na imię " + imie + kropka);
        System.out.println("Mam " + ileMleka + " kartonów mleka, po " + cena + " PLN" + wykrzyknik);
        
            if(ileMleka >= 15) {
                czyPrzecena = true;
                System.out.println("Stan przeceny: " + czyPrzecena);
        }
        else {
            System.out.println("Stan przeceny: " + czyPrzecena);
        }
        
    }
}