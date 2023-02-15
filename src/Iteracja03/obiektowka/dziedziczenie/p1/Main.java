package Iteracja03.obiektowka.dziedziczenie.p1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Kot k1 = new Kot();
        k1.setKolor("Czarny");
        k1.wydajOdglos();

        Ptak p1 = new Ptak();
        p1.setKolor("Rudy");
        p1.wydajOdglos();

        Zwierze zwierze1 = new Zwierze();

        //W JAVIE NIE ISTNIEJE WIELODZIEDZICZENIE KLAS!
        //public class Amfibia extends Samochod, Lodz <---- NIE MOZNA TAK!

        //KAZDA KLASA W JAVIE DZIEDZICZY PO KLASIE OBJECT!!!!!!!!!!!!!!!!!!!!!!
    }
}