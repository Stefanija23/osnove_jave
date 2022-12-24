package Domaci_20_12_2022;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji proverava uparenost zagrada.
//        Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje
//        da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//                Primer izvrsenja:
//        Unos: (
//        Unos: 2
//        Unos: *
//        Unos: (
//        Unos: 1
//        Unos: +
//        Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)

        Scanner s = new Scanner(System.in);
        int otvorenaZagrada =0;
        int zatvorenaZagrada=0;
        System.out.println("Unos: ");
        String karakter = s.next();

        while (!karakter.equals("=")) {
            if (karakter.equals("(")) {
               otvorenaZagrada = otvorenaZagrada +1;
            } if (karakter.equals(")")) {
            zatvorenaZagrada = zatvorenaZagrada +1;}
            System.out.println("Unos: ");
            karakter = s.next();

        if(otvorenaZagrada==zatvorenaZagrada) {
            System.out.println("Zagrade su uparene.");
        }
        }

    }
}
