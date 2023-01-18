package Domaci_16_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Stefanija Spasic", "5846326595", 1993, 23,
                "napadac", true);
        Igrac igrac2 =new Igrac("Pera Peric", "5986532326", 1995, 17,
                "odbrambeni", false);

        Trener trener1 = new Trener("Zoran Zokic", "596131319" , 1970, 20,
                "kondicioni");
        Trener trener2 = new Trener("Mira Maric", "653131446", 1982, 7,
                "personalni");

        igrac1.stampaj();
        igrac2.stampaj();
        trener1.stampaj();
        trener2.stampaj();

    }
}
