package Domaci_19_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {



        Ambalaza jogurt = new Tetrapak("595952265952", "Moja kravica" , 1000, 1170, true, 190);
        Ambalaza vino = new StaklenaAmbalaza("9662632797", "Vranac", 750, 1700, 0,false, 450 );
        Ambalaza sok = new Tetrapak("4631315487", "Vocne kapi", 2000, 2300, true, 190);
        Ambalaza pivo = new StaklenaAmbalaza("4979656659", "Staropramen", 500, 800, 30, true, 60);

        Korpa korpa1 = new Korpa();

        SuperKartica superKartica = new SuperKartica("16842", "Stefanija Spasic", 10);

        korpa1.dodajAmbalazu(jogurt);
        korpa1.dodajAmbalazu(vino);
        korpa1.dodajAmbalazu(sok);
        korpa1.dodajAmbalazu(pivo);

        jogurt.stampaj();
        vino.stampaj();
        sok.stampaj();
        pivo.stampaj();
        superKartica.stampaj();

        System.out.println("Cena korpe: " + korpa1.ukupnaCenaKorpe(superKartica));

        korpa1.izbaciAmbalazu("9662632797");

        System.out.println("Cena korpe: " + korpa1.ukupnaCenaKorpe(superKartica));



    }
}
