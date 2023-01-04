package Domaci_29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaUG;

    public void stampaj() {
        System.out.println(" {{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezinaUG + "}}");
    }
    public void povecajCenu (double povecanje) {
        cena = cena + povecanje;
    }
    public double vratiCenuSaPopustom (double popust) {
        return cena - (cena * popust / 100);
    }
    public double racunajPostarinu (){
        if(tezinaUG <= 100) {
            return 200;
        } else if (tezinaUG<=500) {
            return 400;}
        else {
            return 1000;
            
        }
    }

}
