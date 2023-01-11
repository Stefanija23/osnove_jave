package Domaci_10_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
// (ime autora) (prezime autora)
//
//    Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
// (ISBN)
// (naziv) - (godina izdanja)
// autor: (ime autora) (prezime autora)
//
//    U glavnom programu napraviti vise autora sa vise knjiga.



        Autor a1 = new Autor("Ivo", "Andric");
        a1.stampaj();
        Autor a2 = new Autor ("Orhan" , "Pamuk");
        a2.stampaj();

        Knjiga k1 = new Knjiga(46478, "Na Drni cuprija", 1990, a1);
        k1.stampaj();
        Knjiga k2 = new Knjiga( 15446626, "Zovem se Crveno" , 2015, a2);
        k2.stampaj();
        Knjiga k3 = new Knjiga(48446148, "Gospodjica", 1985, a1);
        k3.stampaj();
    }
}
