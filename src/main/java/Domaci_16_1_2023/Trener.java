package Domaci_16_1_2023;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    public Trener(String imeIprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIprezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public Trener() {
        super();
    }
    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva + " Tip trenera: " + tipTrenera);

    }
}
