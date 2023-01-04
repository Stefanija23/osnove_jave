package Domaci_29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Jagoda";
        proizvod1.cena = 150.00;
        proizvod1.tezinaUG = 100.00;

        proizvod1.stampaj();
        proizvod1.povecajCenu(20);
        System.out.println(proizvod1.cena);
        proizvod1.vratiCenuSaPopustom(10);
        System.out.println(proizvod1.cena);
        System.out.println(proizvod1.racunajPostarinu());

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Jabuka";
        proizvod2.cena = 90.00;
        proizvod2.tezinaUG = 1000.00;

        proizvod2.stampaj();
        proizvod2.povecajCenu(10);
        System.out.println(proizvod2.cena);
        proizvod2.vratiCenuSaPopustom(15);
        System.out.println(proizvod2.cena);
        System.out.println(proizvod2.racunajPostarinu());

    }
}
