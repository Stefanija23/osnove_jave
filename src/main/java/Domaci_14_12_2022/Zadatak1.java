package Domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//        Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//        [ime] [prezime] - [startost] god


        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();
        int starost = 2022 - godinaRodjenja;

        System.out.println("[" + ime + "] " + "[" + prezime + "] -" + "[" + starost + "] god" );
    }
}
