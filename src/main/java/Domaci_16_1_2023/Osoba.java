package Domaci_16_1_2023;

public class Osoba {
    protected String imeIprezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIprezime, String jmbg, int godinaRodjenja) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj () {
        System.out.println("(" + this.imeIprezime + "), ("+ this.jmbg + "), (" + this.godinaRodjenja + ")");
    }
}
