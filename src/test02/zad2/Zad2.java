package test02.zad2;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {
    public static void main(String[] args) {

        /*Zadanie 02:

        (pisz wsio po angielsku)

        Stworz klase Garaz (adres, ilosc miesc, czy moze wjechac lpg, szerokosc miejsca)
        Stworz klase Auto (marka, szerokosc, rodzaj paliwa, cena)

        W garazu moze byc wiele aut, auto moze byc w max 1 garazu.

        - stworz metode ktora pozwoli dodawac auto do garazu uwzgledniajac ograniczenia:
               - w garazu nie moze byc wiecej aut niz jest miejsc.
               - jesli auto jest LPG a do garazu nie moze wjechac LPG - to nie mozna dodac
               - jesli auto jest szersze niz szerokosc miejsca w garazu to tez nie moze wjechac.

        W garażu stworz metody aby:
            - ktorej marki samochodu jest najwiecej w garazu
            - ktorego rodzaju paliwa jest najwiecej w garazu
            - znalezc najdrozsze auto w garazu
            - obliczyc srednia wartosc samochodow w garazu
            - napisac metode co przyjmuje liste garazu i znajdzie garaz ktory jest najbardziej zapelniony
              (czyli np: jak jest 100 miejsc a zajetych jest 70, to znaczy ze garaz zapelniony jest w 70%)
*/
        Garage garage = new Garage("ul. Jana Pawła II", 5, false, 5);
        Garage garage1 = new Garage("Mudreckiego 5", 10, false, 5);
        Garage garage2 = new Garage("Kilińskiego 2", 6, false, 5);


        Car car1 = new Car("Toyota", 4, "Benzyna", 20_000);
        garage.addCar(car1);

        Car car2 = new Car("Tesla", 4, "Prąd", 35_000);
        garage.addCar(car2);

        Car car3 = new Car("Toyota", 4, "LPG", 34_000);
        garage.addCar(car3);

        Car car4 = new Car("Toyota", 2, "Prąd", 36_000);
        garage.addCar(car4);

        Car car5 = new Car("BMW", 2, "Diesel", 5_000);
        garage.addCar(car5);


        System.out.println(garage.carMakesMaxRepetition());

        System.out.println(garage.carFuelTypeMaxRepetition());

        System.out.println(garage.mostExpensiveCar().getBrand());

        System.out.println(garage.averagePrice());

        Car car6 = new Car("BMW", 2, "Benzyna", 40_000);
        garage1.addCar(car6);
        Car car7 = new Car("Tesla", 2, "Prąd", 41_000);
        garage1.addCar(car7);
        Car car8 = new Car("Mercedes", 2, "Diesel", 43_000);
        garage1.addCar(car8);
        Car car9 = new Car("Volkswagen", 2, "Diesel", 45_000);
        garage1.addCar(car9);

        System.out.println(garage1.getCars());


        Car car10 = new Car("Volvo", 2, "Diesel", 20_000);
        garage2.addCar(car10);
        Car car11 = new Car("Opel", 2, "Benzyna", 45_000);
        garage2.addCar(car11);
        Car car12 = new Car("Suzuki", 2, "Diesel", 50_000);
        garage2.addCar(car12);
        Car car13 = new Car("Fiat", 2, "Diesel", 45_000);
        garage2.addCar(car13);
        Car car14 = new Car("Ferrari", 2, "Benzyzna", 70_000);
        garage2.addCar(car14);
        Car car15 = new Car("Volkswagen", 2, "Diesel", 45_000);
        garage2.addCar(car15);


        List<Garage> garages = new ArrayList<>();
        garages.add(garage);
        garages.add(garage1);
        garages.add(garage2);


        System.out.println(findMostFilledGarage(garages));

    }


    public static String findMostFilledGarage(List<Garage> allGarages) {

        float a = (float) allGarages.get(0).getCars().size() / allGarages.get(0).getNumberOfSpaces();
        Garage b = allGarages.get(0);

        for (Garage garage : allGarages) {
            if ((float) garage.getCars().size() / garage.getNumberOfSpaces() > a) {
                a = (float) garage.getCars().size() / garage.getNumberOfSpaces();
                b = garage;
            }
        }
        return "Garage on " + b.getAddress() + " Street is the most filled - " + a * 100 + "%";
    }
}