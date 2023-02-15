package Iteracja03.obiektowka.relacje;

public class KontoBankowe {
    private Osoba wlasciciel;
    private double balans;

    public KontoBankowe(Osoba wlasciciel, double balans) {
        this.wlasciciel = wlasciciel;
        this.balans = balans;
    }

    public Osoba getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(Osoba wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }
}
