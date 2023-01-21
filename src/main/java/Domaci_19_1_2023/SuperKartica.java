package Domaci_19_1_2023;

public class SuperKartica {

    private String brojKartice;
    private String imeIPrezime;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String imeIPrezime, int popust) {
        this.brojKartice = brojKartice;
        this.imeIPrezime = imeIPrezime;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampaj() {
        System.out.println("(" + this.brojKartice + "), (" + this.imeIPrezime + ")");
    }
}
