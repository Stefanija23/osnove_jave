package Domaci_17_1_2023;

public class VideoPlayer {
    private double duzinaVidea;
    private double trenutnoVreme;
    private double jacina;
    private double kvalitet;

    public VideoPlayer(double duzinaVidea, double trenutnoVreme, double jacina, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacina = jacina;
        this.kvalitet = kvalitet;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public double getJacina() {
        return jacina;
    }

    public void setJacina(double jacina) {
        this.jacina = jacina;
    }

    public double getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }
    public void stampaj () {
        System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.jacina);
        System.out.println("Kvalitet videa: " + this.kvalitet);
    }
}
