package test02.zad1;

import java.util.Objects;

public class Kwadrat extends Figura {

    private double bok;

    Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obliczPole() {
        return bok * bok;
    }

    public double obliczObwod() {
        return bok * 4;
    }

    @Override
    public String opis() {
        return "Kwadrat o boku " + bok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return Double.compare(kwadrat.bok, bok) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bok);
    }
}
