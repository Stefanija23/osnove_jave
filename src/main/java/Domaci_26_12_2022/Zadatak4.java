package Domaci_26_12_2022;

import java.util.Scanner;
import java.util.SortedMap;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//                Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);
        System.out.print("JMBG: ");
        String jmbg = s.next();
        System.out.print("Ime: ");
        String ime = s.next();
        System.out.print("Prezime: ");
        String prezime = s.next();
        System.out.print("God.rodjenja: ");
        int godinaRodjenja = s.nextInt();
        System.out.print("Aktivnost: ");
        boolean aktivnost = s.nextBoolean();

        formatPodaciKorisnika(jmbg,ime,prezime,godinaRodjenja,aktivnost);


    }


       public static void formatPodaciKorisnika (String jmbg, String ime, String prezime, int godinaRodjenja,
                                                 boolean aktivnost) {
           System.out.println("JMBG: [" + jmbg + "]");
           System.out.println("Ime: [" + ime + "]");
           System.out.println("Prezime: [" + prezime + "]");
           System.out.println("God.rodjenja: [" + godinaRodjenja + "]");
           System.out.println("Aktivan: [" + aktivnost + "]");
       }
}
