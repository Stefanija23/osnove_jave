package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//        funkcije vraca novu vrednost koja se formira kao na primeru.
//        METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi jednocifreni broj: ");
        int prvi = s.nextInt();
        System.out.println("Unesite drugi jednocifreni broj: ");
        int drugi = s.nextInt();

        int rezultat = lepljenje(prvi,drugi);
        System.out.println("Nova vrednost je: " + rezultat);

    }

    public static int lepljenje (int a, int b) {
        int dobijeniBroj = a * 10 + b;
        return dobijeniBroj;

    }


}
