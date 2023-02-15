package test02.zad1;


abstract class Figura {
    private final int numer;
    private static int iterator = 0;

    abstract double obliczPole();
    abstract double obliczObwod();


    static Figura stworzKwadrat(double bok) {
        return new Kwadrat(bok);
    }

    static Figura stworzKolo(double promien) {
        return new Kolo(promien);
    }

    static Figura stworzProstokat(double bokA, double bokB) {
        return new Prostokat(bokA, bokB);
    }

    public abstract String opis();

    public Figura() {
        this.numer = ++iterator;
    }


    public String toString() {
        return "Figura nr " + numer + ": " + opis();
    }
}
