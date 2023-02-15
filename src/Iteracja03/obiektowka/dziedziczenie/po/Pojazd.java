package Iteracja03.obiektowka.dziedziczenie.po;

public class Pojazd {
    private Silnik silnik;
    private double iloscPaliwa;


    public void startujSilnik() {
        System.out.println("WRRRRUUUUUUM");
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }

    public double getIloscPaliwa() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(double iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

}