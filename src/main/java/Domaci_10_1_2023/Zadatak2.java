package Domaci_10_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu Proizvod koja ima
//        Naziv proizvoda
//        kupca/musteriju
//        cenu izrade proizvoda
//        gettere i settere
//        konstruktore
//        Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//        cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//        Metodu za stampanje proizvoda u formatu:
//        naziv proizvoda - cena
//        ime i prezime - broj kartice
//
//        Kreirati klasu Kupac koja ima:
//        ime i prezime
//        clansku kartu
//        gettere i settere, clanska karta ne moze da se menja
//        konstruktore
//        metodu stampaj koja stampa u formatu
//        ime i prezime - broj kartice
//
//        Kreirati klasu ClanskaKarta koja ima:
//        popust (u rasponu od 5 do 10 %)
//        broj kartice (npr: 9329-0239)
//        gettere i setter
//        konstuktore


        ClanskaKarta clanskaKarta1 = new ClanskaKarta(10,"1646-466-446");
        ClanskaKarta clanskaKarta2 = new ClanskaKarta(15,"464656-46665");

        Kupac kupac1 = new Kupac("Stefanija Spasic" , clanskaKarta1);
        kupac1.stampaj();
        Kupac kupac2 = new Kupac("Mara Maric", clanskaKarta2);
        kupac2.stampaj();
        System.out.println();

        Proizvod proizvod1 = new Proizvod("Maskara", kupac1, 500);
        proizvod1.stampaj();
        Proizvod proizvod2 = new Proizvod("Maska za lice", kupac2, 650);
        proizvod2.stampaj();


    }
}
