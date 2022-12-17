package Domaci_16_12_2022;

import java.util.Scanner;

public class ZadatakZaVezbanje4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenzije table: ");
        int dimenzija = s.nextInt();
        String tabla = "_|";

        for (int i = 1; i <=dimenzija ; i++) {
            for (int j = 1; j <=dimenzija; j++) {
                System.out.print(tabla);
            }
            System.out.println();

        }
    }
}
