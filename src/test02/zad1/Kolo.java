package test02.zad1;

import java.util.Objects;

public class Kolo extends Figura {
    private double promien;


    Kolo(double promien) {
        this.promien = promien;
    }

    double obliczPole() {
        return Math.PI * promien * promien;
    }

    double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    public String opis() {
        return "Koło o promieniu " + promien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kolo kolo = (Kolo) o;
        return Double.compare(kolo.promien, promien) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(promien);
    }
}
