package Iteracja03.obiektowka.relacje;

public class Kredyt {
    private Osoba osoba;
    private double iloscPozyczona, iloscDoZwrotu, oprocentowanie;
    private int iloscMiesiecy;

    public Kredyt(Osoba osoba, double iloscPozyczona, double iloscDoZwrotu, double oprocentowanie, int iloscMiesiecy) {
        this.osoba = osoba;
        this.iloscPozyczona = iloscPozyczona;
        this.iloscDoZwrotu = iloscDoZwrotu;
        this.oprocentowanie = oprocentowanie;
        this.iloscMiesiecy = iloscMiesiecy;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public double getIloscPozyczona() {
        return iloscPozyczona;
    }

    public void setIloscPozyczona(double iloscPozyczona) {
        this.iloscPozyczona = iloscPozyczona;
    }

    public double getIloscDoZwrotu() {
        return iloscDoZwrotu;
    }

    public void setIloscDoZwrotu(double iloscDoZwrotu) {
        this.iloscDoZwrotu = iloscDoZwrotu;
    }

    public double getOprocentowanie() {
        return oprocentowanie;
    }

    public void setOprocentowanie(double oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
    }

    public int getIloscMiesiecy() {
        return iloscMiesiecy;
    }

    public void setIloscMiesiecy(int iloscMiesiecy) {
        this.iloscMiesiecy = iloscMiesiecy;
    }
}
