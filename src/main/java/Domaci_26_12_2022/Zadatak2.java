package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//                Metoda od parametara prima ime i prezime (2 parametra)
//        i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//        Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String unetoIme = s.next();
        System.out.println("Unesite prezime: ");
        String unetoPrezime = s.next();

        System.out.println("Uneto ime i prezime je: " + spajanje(unetoIme,unetoPrezime));



    }

    public static String spajanje(String ime, String prezime) {
        String imeIprezime = ime + " " + prezime;
        return imeIprezime;

    }

}
