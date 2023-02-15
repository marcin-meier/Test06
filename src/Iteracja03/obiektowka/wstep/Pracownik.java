package Iteracja03.obiektowka.wstep;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;

public class Pracownik {

    String imie;
    String nazwisko;
    long pesel;
    int pensja;

    Pracownik(String imiePracownika, String nazwiskoPracownika, long peselPracownika, int pensjaPracownika) {
        imie = imiePracownika;
        nazwisko = nazwiskoPracownika;
        pesel = peselPracownika;
        pensja = pensjaPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    //99 10 24 08 339

    public long whatYearOfBirth() {
        long k = 0;
        long x = pesel / 1000000000;
        if (x < 25)
            k = Long.parseLong("20" + x);
        else
            k = Long.parseLong("19" + x);
        return k;
    }// NIE DZIAŁA GDY KTOS URODZIL SIE POMIEDZY 2000 a 2009

    public long whatMonth() {
        return (pesel / 10000000) % 100;
    }

    public long whatDay() {
        return (pesel / 100000) % 100;
    }

    @Override
    public String toString() {
        return
                imie + " " + nazwisko ;
    }
}