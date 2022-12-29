package Domaci_27_12_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezinag;

    public void stampaj(){
        System.out.println("{{ " + this.naziv + " }}, {{" + this.cena + "}}, {{" + this.tezinag + "}}");
    }

    public double konvertuj(double x, String jedinica) {
        if (jedinica.equals("kg")) {
            return x /1000;
        } else if (jedinica.equals("t")) {
            return  x / 1000000;
        }else {
            return 0;
        }
    }
}
