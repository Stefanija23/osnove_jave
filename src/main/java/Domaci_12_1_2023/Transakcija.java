package Domaci_12_1_2023;

public class Transakcija {
    private int id;
    private Racun racunSaKog;
    private Racun racunNaKoji;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getRacunSaKog() {
        return racunSaKog;
    }

    public void setRacunSaKog(Racun racunSaKog) {
        this.racunSaKog = racunSaKog;
    }

    public Racun getRacunNaKoji() {
        return racunNaKoji;
    }

    public void setRacunNaKoji(Racun racunNaKoji) {
        this.racunNaKoji = racunNaKoji;
    }

    public Transakcija(int id, Racun racunSaKog, Racun racunNaKoji) {
        this.id = id;
        this.racunSaKog = racunSaKog;
        this.racunNaKoji = racunNaKoji;
    }
    public double provizija (double transakcija) {
        if (transakcija < 4500) {
            return 45;
        } else {
            return transakcija * 0.01;
        }
    }
    public void izvrsiTransakciju (double transakcija){
        double provizija = provizija(transakcija);
        double novoStanjeSaKog = this.racunSaKog.getStanje() - (transakcija + provizija);
        if (novoStanjeSaKog < 0) {
            System.out.println("Nemate dovoljno sredstava na racunu.");
        } else {
            this.racunSaKog.promeniStanje(-transakcija-provizija);
            this.racunNaKoji.promeniStanje(transakcija);
        }
    }
    public void stampajTransakciju(){
        System.out.println("id transakcije: " + this.id);
        System.out.println("Racun sa: " + this.racunSaKog.getImeIPrezimeKorisnika() + " - " + this.racunSaKog.getBroj());
        System.out.println("Racun na: " + this.racunNaKoji.getImeIPrezimeKorisnika() + " - " + this.racunNaKoji.getBroj());
    }
}
