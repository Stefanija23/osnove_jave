package Domaci_19_1_2023;

public class Tetrapak extends Ambalaza {
    private boolean seMozeReciklirati;
    private double osnovnaCena;


    public boolean isSeMozeReciklirati() {
        return seMozeReciklirati;
    }

    public void setSeMozeReciklirati(boolean seMozeReciklirati) {
        this.seMozeReciklirati = seMozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean seMozeReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.seMozeReciklirati = seMozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(isSeMozeReciklirati()) {
            return (tezinaPakovanja() *1.5 + osnovnaCena);
        } else {
            return osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + super.barkod);
        System.out.println("Naziv artikla: " + super.nazivArtikla);
        System.out.println("Neto tezina: " + super.netoTezina);
        System.out.println("Bruto tezina: " + super.brutoTezina);
        System.out.println("Tezina pakovanja: " + super.tezinaPakovanja());
        System.out.println("Cena artikla: " + this.cenaArtikla());
        System.out.println("Recikliran: " );
        if (isSeMozeReciklirati()) {
            System.out.println("da");
        }else {
            System.out.println("ne");
        }
        System.out.println("***************");

    }
}
