package Domaci_27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu
//        u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode


        Proizvod brasno = new Proizvod();
        brasno.naziv ="Mlin";
        brasno.cena = 100;
        brasno.tezinag =1000;

        brasno.stampaj();
        double tezinakg = brasno.konvertuj(brasno.tezinag, "kg");
        System.out.println("Tezina u kg: " + tezinakg + "kg");
        System.out.println();


        Proizvod jabuke = new Proizvod();
        jabuke.naziv ="Green smith";
        jabuke.cena =350;
        jabuke.tezinag = 2000;

        jabuke.stampaj();
        double tezinak = jabuke.konvertuj(jabuke.tezinag, "kg");
        System.out.println("Tezina u kg: " + tezinakg + "kg");
        System.out.println();


        }
    }





