package Domaci_12_1_2023;

import java.util.ArrayList;

public class ZeleniKarton {
    private String ime;
    private String prezime;
    private int brojIndexa;
    private String predmet;
    private String imeProfesora;
    private String prezimeProfesora;
    private int ocena;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public String getPrezimeProfesora() {
        return prezimeProfesora;
    }

    public void setPrezimeProfesora(String prezimeProfesora) {
        this.prezimeProfesora = prezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String ime, String prezime, int brojIndexa, String predmet, String imeProfesora,
                        String prezimeProfesora, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
        this.predmet = predmet;
        this.imeProfesora = imeProfesora;
        this.prezimeProfesora = prezimeProfesora;
        this.ocena = ocena;
    }

    public boolean jePolozio (int ocena) {
        if (ocena > 5) {
            return true;
        }else {
            return false;
        }
    }
    public void stampajPodatke () {
        System.out.print("(" + this.getPredmet() + ") ");
        if (this.jePolozio(this.ocena)) {
            System.out.println(this.ocena);
            System.out.println("Student: " + this.ime + " " + this.prezime + ", " + this.brojIndexa);
            System.out.println("Profesor: "+ this.imeProfesora +  " i " +  this.prezimeProfesora );
            System.out.println();
        }else {
            System.out.println("Student: " + this.ime + " " + this.prezime + " nije polozio.");
            System.out.println();
        }

    }

}
