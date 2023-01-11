package Domaci_10_1_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta clanskaKarta;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }


    public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta) {
        this.imeIPrezime = imeIPrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public void stampaj() {
        System.out.println("ime i prezime" + this.imeIPrezime + "broj kartice" + this.clanskaKarta);
    }
    public double popust() {
        double popust = this.clanskaKarta.getPopust();
        return popust;
    }
}
