package Iteracja03.obiektowka.wstep;

public class Student {

    String imie;
    String nazwisko;
    int wiek;

    //KONSTRUKTOR sluzy do utworzenia nowego obiektu, ma identyczna nazwe co klasa, nie ma okreslonego typu zwracanego
    //a do jego wywolania uzywamy operatora NEW.
    Student() {
        System.out.println("Tworze nowego studenta");
    }

    Student(String imie, String nazwisko, int wiek) {
        this(imie);
        //przypisz do pola klasy o nazwie imie parametr konstruktora o nazwie imie
        //slowo this oznacza tak naprawde referencje na obiekt, ktory utworzylismy
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    Student(String imie) {
        this();
        //przypisz do pola klasy o nazwie imie parametr konstruktora o nazwie imie
        //slowo this oznacza tak naprawde referencje na obiekt, ktory utworzylismy
        this.imie = imie;
    }

    public void printInfo() {
        System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat");
    }
}
