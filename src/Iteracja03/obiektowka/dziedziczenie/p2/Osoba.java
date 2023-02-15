package Iteracja03.obiektowka.dziedziczenie.p2;

public class Osoba {
    private String imie, nazwisko;

    public Osoba(String imie, String nazwisko) {
        System.out.println("TWORZE OSOBE");
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dupa() {
        System.out.println("dupa");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
