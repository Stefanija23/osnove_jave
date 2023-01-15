package Domaci_13_1_2023;

public class Zadatak1 {

    public static void main(String[] args) {
        Ispit i1 = new Ispit("Istorija starog Rima", 8, "Irena Ljubomirovic");
        Ispit i2 = new Ispit("Istorija naroda Balkana", 10, "Slavisa Nedeljkovic");
        Ispit i3 = new Ispit("Istorijska geografija", 6, "Vladimir Aleksic");

        Student s1 = new Student(1013, "Stefanija Spasic", "Osnovne");

        s1.dodajIspit(i1);
        s1.dodajIspit(i2);
        s1.dodajIspit(i3);
        s1.stampaj();
    }
}
