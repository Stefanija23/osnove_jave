package Domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak5_1nacin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite operator: ");
        String operator = s.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat: " + (a+b));
        } else if (operator.equals("-")) {
            System.out.println("Rezultat: " + (a-b));
        } else if (operator.equals("*")) {
            System.out.println("Rezultat: " + (a*b));
        } else if (operator.equals("/")) {
            System.out.println("Rezultat: " + (a/b));
        } else {
            System.out.println("Uneli ste pogresan operator.");




        }
    }
}
