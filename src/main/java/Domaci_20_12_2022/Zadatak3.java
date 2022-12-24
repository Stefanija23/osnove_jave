package Domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.

        Scanner s = new Scanner(System.in);
        int brojacJedinice = 0;
        int brojacDvojke = 0;
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        while (brojacDvojke<2) {
            if(broj==2){
                brojacDvojke= brojacDvojke +1;
            }
            while (brojacJedinice<3) {
                if(broj==1) {
                    brojacJedinice = brojacJedinice + 1;
                }
                System.out.println("Unesite broj: ");
                broj = s.nextInt();
            }
            System.out.println("Kraj programa jer su unete tri jedinice.");
            System.out.println("Unesite broj:");
            broj = s.nextInt();
        }
        System.out.println("Kraj programa jer su unete dve dvojke.");
    }
}
