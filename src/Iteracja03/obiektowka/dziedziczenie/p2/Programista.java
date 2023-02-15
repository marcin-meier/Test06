package Iteracja03.obiektowka.dziedziczenie.p2;

import java.util.List;

public class Programista extends Osoba {
    private List<String> ulubioneJezykiProgramowania;

    public Programista(String imie, String nazwisko, List<String> ulubioneJezykiProgramowania) {
        super(imie, nazwisko);
        System.out.println("TWORZE PROGRAMISTE");
        this.ulubioneJezykiProgramowania = ulubioneJezykiProgramowania;
    }

    public void dupa() {
        super.dupa();
        System.out.println("dupa2");
    }

    public List<String> getUlubioneJezykiProgramowania() {
        return ulubioneJezykiProgramowania;
    }

    public void setUlubioneJezykiProgramowania(List<String> ulubioneJezykiProgramowania) {
        this.ulubioneJezykiProgramowania = ulubioneJezykiProgramowania;
    }
}
