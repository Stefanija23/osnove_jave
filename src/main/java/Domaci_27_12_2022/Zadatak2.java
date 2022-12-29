package Domaci_27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i
//        za svaki od njih pozvati metode


        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka ="Bosch";
        klima.haldiGreje ="grejanje";
        klima.izabranaTemp = 30;

        klima.stampanje();
        System.out.println(klima.spoljnaTemp(-6));

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka ="Gorenje";
        klima2.haldiGreje="grejanje";
        klima2.izabranaTemp = 25;

        klima2.stampanje();
        System.out.println(klima2.spoljnaTemp(2));

    }
}
