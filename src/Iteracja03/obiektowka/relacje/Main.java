package Iteracja03.obiektowka.relacje;

public class Main {
    public static void main(String[] args) {

        //AGREGACJA - jezeli jakis obiekt sklada sie z innych obiektow, to mowimy ze to jest relacja, a dokladniej agregacja.
        //np.: Konto bankowe ma właściciela, właściciel może mieć wiele kont bankowych lub wgl

        //KOMPOZYCJA - szczegolnym przypadkiem agregacji jest kompozycja, w ktorej istnienie obiektu bez swojego rodzica nie ma sensu.

        Osoba o1 = new Osoba("Jan", "Nowak", "123123123", new Adres("Prosta 10", "00-000", "Warszawa"));
        KontoBankowe kb1 = new KontoBankowe(o1, 10000);
        Kredyt k1 = new Kredyt(o1, 100, 1000, 1000, 36);

        System.out.println(o1);
        System.out.println(o1.getAdresZamieszkania());
        System.out.println("posiada konto bankowe z balansem: " + kb1.getBalans());
        System.out.println("oraz kredyt na kwote: " + k1.getIloscDoZwrotu());
        System.out.println(k1.getOsoba().getImie());

    }
}