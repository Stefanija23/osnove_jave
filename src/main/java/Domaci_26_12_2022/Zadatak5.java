package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//        / / / / /
//        Napomena: Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int broj = s.nextInt();
        System.out.println("Unesite karakter: ");
        String karakter = s.next();

        unesi(broj,karakter);

    }

    public static void unesi (int n, String karakter) {
        for (int i = 1; i <=n ; i++) {
            System.out.print(karakter + " ");

        }

    }


}
