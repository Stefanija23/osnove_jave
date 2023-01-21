package Domaci_19_1_2023;

public class StaklenaAmbalaza extends Ambalaza{

    private double kaucija;
    private boolean sePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucija, boolean sePlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.sePlacaKaucija = sePlacaKaucija;
        this.osnovnaCena=osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isSePlacaKaucija() {
        return sePlacaKaucija;
    }

    public void setSePlacaKaucija(boolean sePlacaKaucija) {
        this.sePlacaKaucija = sePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(isSePlacaKaucija()) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        }else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + super.barkod);
        System.out.println("Naziv artikla: " + super.nazivArtikla);
        System.out.println("Neto tezina: " + super.netoTezina);
        System.out.println("Bruto tezina: " + super.brutoTezina);
        System.out.println("Kaucija: " + this.kaucija);
        System.out.println("Cena artikla: " + this.cenaArtikla());
        System.out.println("Da li se placa kaucija: " );
        if (isSePlacaKaucija()) {
            System.out.println("da");
        }else {
            System.out.println("ne");
        }
        System.out.println("***************");

    }
}
