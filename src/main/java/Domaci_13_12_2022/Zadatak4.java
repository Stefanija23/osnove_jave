package Domaci_13_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//        KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//        Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30
// P = a2 * koren iz 3 poljeno sa 4

        int a = 10;
        int obimTrougla = a * 3;
        double konstanta = 1.73;

        System.out.println("a: "+ a);
        System.out.println("Povrsina je: " + (a * a)*konstanta/4);
        System.out.println("Obim je: " + obimTrougla);

    }
}
