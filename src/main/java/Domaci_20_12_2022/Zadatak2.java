package Domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
//        sve dok korisnik ne unese KRAJ..

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rimski broj: ");
        String rimskiBroj = s.next();

        while (!rimskiBroj.equals("kraj")) {
            if(rimskiBroj.equals("I")) {
                System.out.println("Arapski:  1");
            }if (rimskiBroj.equals("V")) {
                System.out.println("Arapski:  5");
            }if (rimskiBroj.equals("X")){
                System.out.println("Arapski:  10");
            }if (rimskiBroj.equals("L")){
                System.out.println("Arapski:  50");
            }if (rimskiBroj.equals("C")){
                System.out.println("Arapski: 100");
            }if (rimskiBroj.equals("D")) {
                System.out.println("Arapski: 500");
            }if (rimskiBroj.equals("M")) {
                System.out.println("Arapski: 1000");
            }
            System.out.println("Unesite rimski broj: ");
            rimskiBroj = s.next();
        }
        System.out.println("Kraj programa.");
    }
}
