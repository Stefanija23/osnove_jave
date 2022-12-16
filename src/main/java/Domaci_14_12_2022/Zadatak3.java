package Domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite koordinatu x za T1: ");
        int xT1 = s.nextInt();
        System.out.println("Unesite koordinatu y za T1: ");
        int yT1 = s.nextInt();
        System.out.println("Unesite koordinatu x za T2: ");
        int xT2 = s.nextInt();
        System.out.println("Unesite koordinatu y za T2: ");
        int yT2 = s.nextInt();
        System.out.println("Unesite koordinatu x za M: ");
        int xM = s.nextInt();
        System.out.println("Unesite koordinatu y za M: ");
        int yM = s.nextInt();

        if (xT1 == 10 && yT1 == 100 && xT2 == 100 && yT2 == 0 && xM >= 10 && xM <= 100 && yM >= 0 && yM <= 100) {
            System.out.println("Kliknuto je unutar forme.");
        } else {
            System.out.println("Nije kliknuto unutar forme.");
        }
    }
}
