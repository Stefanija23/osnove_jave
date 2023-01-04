package Domaci_29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        post1.setAutorImeIPrezime("Pera Peric");
        post1.setProfilImeIPrezime("Mika Mikic");
        post1.setTekst("Srecan rodjendan!");

        post1.print();
        post1.like();
        post1.share();
        post1.print();


        FacebookPost post2 = new FacebookPost();
        post2.setAutorImeIPrezime("Zoki Zokic");
        post2.setProfilImeIPrezime("Dragi Dragic");
        post2.setTekst("Srecna slava!");

        post2.print();
        post2.like();
        post2.share();
        post2.print();

    }
}
