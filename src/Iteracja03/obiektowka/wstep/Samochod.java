package Iteracja03.obiektowka.wstep;

import java.util.ArrayList;
import java.util.List;

public class Samochod {
    //POLA KLASY (class fields)
    String marka;
    String model;
    String kolor;
    int przebieg;
    int cena;
    int rokProdukcji;

    Samochod(String marka, String model, String kolor, int przebieg, int cena, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
    }


    public void lowerThan(double lowerThan) {
        if (cena < lowerThan)
            System.out.println(marka + " ");
    }

    //metoda instancyjna - metoda pomocnicza
    public boolean isPriceLowerThan(double price) {
        return cena < price;
    }

    public void reducePrice(int howMuch) {
        if (cena < howMuch) {
            System.out.println("Pierwotna cena samochodu " + marka + " niższa od kwoty promocji !");
        } else {
            cena -= howMuch;
        }
    }

    public void info() {
        System.out.println(cena);
    }

//    public void oldestAndNewestCar() {
//        int min = rokProdukcji;
//
//        if(ro)
//    }

    public void allRed() {
        if (kolor.equals("red"))
            System.out.println(marka);
    }

    public boolean isRed() {
        return kolor.equals("red");
    }

//    public boolean doColorMatch(String color) {
//        return kolor.equals(color);
//    }

    public void whatCar(String marka, String model) {

        if (this.marka.equals(marka) && this.model.equals(model))
            System.out.println("Marka : " + this.marka + ", model : " + this.model);
    }



    //METODACH - funkcjonalnosci

    //metoda instancyjna mozna wywolac tylko na konkretnym egzemplarzu klasy
//    public void printInfo() {
//        System.out.println(
//                marka + " " + model
//                + "\nKolor: " + kolor
//                + "\nIlosc drzwi: " + iloscDrzwi
//        );

}
