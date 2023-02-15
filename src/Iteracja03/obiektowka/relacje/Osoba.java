package Iteracja03.obiektowka.relacje;

public class Osoba {
    private String imie, nazwisko, pesel;
    private Adres adresZamieszkania;

    public Osoba(String imie, String nazwisko, String pesel, Adres adresZamieszkania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.adresZamieszkania = adresZamieszkania;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Adres getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(Adres adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
