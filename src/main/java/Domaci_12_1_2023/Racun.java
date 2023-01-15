package Domaci_12_1_2023;

public class Racun {

    private String broj;
    private String ImeIPrezimeKorisnika;
    private double stanje;

    public String getBroj() {
        return broj;
    }

    public String getImeIPrezimeKorisnika() {
        return ImeIPrezimeKorisnika;
    }

    public double getStanje() {
        return stanje;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }



    public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
        ImeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }

    public Racun(String broj, String imeIPrezimeKorisnika, double stanje) {
        this.broj = broj;
        ImeIPrezimeKorisnika = imeIPrezimeKorisnika;
        this.stanje = stanje;
    }

    public void promeniStanje(double vrednost) {
        if (this.stanje + vrednost < 0) {
            this.stanje = this.stanje + vrednost;
        } else {
            System.out.println("Stanje na racunu ne moze biti manje od 0.");
        }
    }
    public void stampaj () {
        System.out.println("Ime i prezime" + this.ImeIPrezimeKorisnika + "-  broj racuna" + this.broj);
        System.out.println("Stanje na racunu je " + this.stanje + "rsd.");
    }
}
