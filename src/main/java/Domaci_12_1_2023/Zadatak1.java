package Domaci_12_1_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ZeleniKarton z1 = new ZeleniKarton("Stefanija" , "Spasic" , 1013,
                "Istorija starog Rima", "Irena", "Randjelovic", 8);
        ZeleniKarton z2 = new ZeleniKarton("Pera", "Peric", 1542,"Istroija starog Istoka",
                "Irena", "Randjelovic", 5);
        ZeleniKarton z3 = new ZeleniKarton("Mika", "Mikic", 1111, "Istorija stare Grcke",
                "Irena", "Randjelovic" , 10);
        ZeleniKarton z4 = new ZeleniKarton("Zika", "Zikic", 2464, "Istorija Srba",
                "Vladimir" , "Aleksic", 9);
        ZeleniKarton z5 = new ZeleniKarton("Toma" , "Tomic", 2458, "Istorija Jugoslavije",
                "Slavisa", "Nedeljkovic", 7);
        ZeleniKarton z6 = new ZeleniKarton("Milica", "Milic", 12354, "Vizantija", "Jasmina" ,
                "Igic" , 6);
        ZeleniKarton z7 = new ZeleniKarton("Neda", "Nedic", 12545, "Istorija Srba",
                "Djordje" , "Djekic", 5);
        ZeleniKarton z8 = new ZeleniKarton("Lazar", "Lakic", 12547, "Rani srednji vek",
                "Nebojsa" , "Porcic", 10);
        ZeleniKarton z9 = new ZeleniKarton("Sima", "Simic", 4587, "Pozni srednji vek" ,
                "Nebojsa", "Porcic", 7);
        ZeleniKarton z10 = new ZeleniKarton("Zora", "Zoric", 58744, "Istorija naroda Balkana",
                "Slavisa", "Nedeljkovic", 8);


        ispiti.add(z1);
        ispiti.add(z2);
        ispiti.add(z3);
        ispiti.add(z4);
        ispiti.add(z5);
        ispiti.add(z6);
        ispiti.add(z7);
        ispiti.add(z8);
        ispiti.add(z9);
        ispiti.add(z10);

        for (int i = 0; i <ispiti.size() ; i++) {
            ispiti.get(i).stampajPodatke();
        }

    }
}
