package Domaci_19_1_2023;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Ambalaza>ambalaze;

    public Korpa () {
        ambalaze = new ArrayList<Ambalaza>();
    }
    public void dodajAmbalazu (Ambalaza a) {
        ambalaze.add(a);
    }
    public void izbaciAmbalazu (String barkod) {
        for (int i = 0; i <this.ambalaze.size(); i++) {
            if(this.ambalaze.get(i).getBarkod().equals(barkod)) {
                this.ambalaze.remove(i);
            }
        }
    }
    private double cenaAmbalazaSaPopustom (double popust) {
        double cenaAmbalaze = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaAmbalaze = cenaAmbalaze + this.ambalaze.get(i).cenaArtikla() * popust;
        }
        return cenaAmbalaze - popust;
    }
    public double ukupnaCenaKorpe (SuperKartica kartica)  {
        double cenaKorpe = 0;
        for (int i = 0; i <this.ambalaze.size() ; i++) {
            cenaKorpe = cenaKorpe + this.ambalaze.get(i).cenaArtikla();
        }
        return cenaKorpe - kartica.getPopust();

    }


}
