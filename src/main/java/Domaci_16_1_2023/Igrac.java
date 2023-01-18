package Domaci_16_1_2023;

public class Igrac extends Osoba {
    private int brojIgraca;
    private String pozicija;
    private boolean jeKapiten;

    public Igrac() {
        super();
    }

    public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija, boolean jeKapiten) {
        super(imeIprezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
    }

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }
    @Override
    public void stampaj () {
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj igraca: " + this.brojIgraca + "pozicija: " + this.pozicija );
        if (isJeKapiten()) {
            System.out.println("Igrac je kapiten");
        }else {
            System.out.println("Igrac nije kapiten.");
        }
    }
}
