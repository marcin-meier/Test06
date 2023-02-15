package Iteracja03.obiektowka.dziedziczenie.p2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //w javie konstrutkory nie sa dziedzioczone! tylko skladowe klasy (pola, metody (oprócz konstruktorów)) ktore sa publiczne
        //
        //super() - dzieki temu mozemy odwolac sie do konstruktora wyzej (z klasy bazowej)


        /*
        Nawet jesli tego nie zapiszesz, to pierwsza instrukcja w konstruktorze jest super()

        dzieki super() mozemy z konstruktora naszej klasy wywolac konstruktor z klasy nadrzednej (macierzystej), jezeli w klasie nadrzednej
        bedzie kilka konsruktorow, to wywolany bedzie ten, ktory odpowiada przekazanym do super() argumentom

        super.nazwaMetody() mozemy wywolac dowolna metode z klasy nadrzednej, przydatne jesli nadpisales metode z klasy nadrzednej
        ale nadal potrzebujesz do niej dostepu.
         */
        Programista p1 = new Programista("imie", "nazw", List.of("JAVA", "PHP"));
        System.out.println(p1.getImie());

        p1.dupa();

    }
}
