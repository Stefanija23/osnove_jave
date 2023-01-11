package Domaci_10_1_2023;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cenaIzrade;

    public Proizvod(String naziv, Kupac kupac, int cenaIzrade) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvoda (double popust) {
        return cenaIzrade * 1.9 * (100 - popust) / 100;
    }
    public void stampaj () {
        System.out.println("naziv proizvoda" + this.naziv + " - cena" + this.cenaIzrade);
        System.out.println("ime i prezime" + this.kupac +" - broj kartice" );

    }

}

