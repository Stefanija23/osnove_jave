package Domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak5_2nacin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        int c = 0;
        System.out.println("Unesite operator: +,-,*,/");
        String operator = s.next();

        if (operator.equals("+")) {
            c = a + b;
        } else if (operator.equals("-")) {
            c = a - b;
        } else if (operator.equals("*")) {
            c = a * b;
        } else if (operator.equals("/")) {
            c = a / b;
        } else {
            System.out.println("Uneli ste pogresan operator.");
        }

        System.out.println("Rezultat: " + c);

    }
}