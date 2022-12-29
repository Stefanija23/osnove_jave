package Domaci_27_12_2022;

public class SmartAirConditioning {

    public String marka;
    public int izabranaTemp;
    public String haldiGreje;

    public void stampanje() {

        System.out.println("{{ " + this.marka + " }}, {{" + this.izabranaTemp + "}}, {{" + this.haldiGreje + "}}");

    }

    public String spoljnaTemp (int spoljnaTemp ) {
        if (spoljnaTemp > this.izabranaTemp) {
            return "Spoljna temperatura je veca.";
        } else {
           return  "Unutrasnja temperatura je veca.";
        }
    }

}
