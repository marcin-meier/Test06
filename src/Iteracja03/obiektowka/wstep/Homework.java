package Iteracja03.obiektowka.wstep;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {

        Samochod teslaKuby = new Samochod("tesla", "cyberTruck", "black", 500, 499, 2023);

        Samochod lamborghiniMarcina = new Samochod("lamborghini", "urus", "yellow", 50000, 1000000, 2020);

        Samochod ferrariMichala = new Samochod("ferrari", "berlinetta", "red", 100, 2000000, 2040);

        Samochod bentleyKrzysztofa = new Samochod("bentley", "bentayaga", "darkBlue", 0, 5000000, 2024);


        List<Samochod> luxusCars = new ArrayList<>();
        luxusCars.add(teslaKuby);
        luxusCars.add(lamborghiniMarcina);
        luxusCars.add(ferrariMichala);
        luxusCars.add(bentleyKrzysztofa);


        System.out.println("zad1a");
        autaTanszeNiz(luxusCars, 600_000);

        System.out.println();

        System.out.println("zad1b");
        for (Samochod car : luxusCars)
            car.reducePrice(500);

        for (Samochod car : luxusCars)
            car.info();

//        for (Samochod car : luxusCars)
//            car.allRed();
        wypiszWszystkieCzerwoneAuta(luxusCars);

        doesModelAndMadeMatch(luxusCars, "cyberTruck", "tesla");

        System.out.println(luxusCars.get(0).cena);

        System.out.println(newestCar(luxusCars).marka);
        System.out.println(oldestCar(luxusCars).marka);


    }

    public static void wypiszWszystkieCzerwoneAuta(List<Samochod> list) {
        for (Samochod car : list) {
            if (car.isRed()) {
                System.out.println(car.marka);
            }
        }
    }

    //czy np. zwrocic liste wszystkich aut ktore spelniaja dany warunek
    public static void autaTanszeNiz(List<Samochod> list, double price) {
        for (Samochod car : list) {
            if (car.isPriceLowerThan(price)) {
                System.out.println(car.marka);
            }
        }
    }

    public static void doesModelAndMadeMatch(List<Samochod> car, String model, String marka) {
        for (Samochod auto : car)
            if (auto.marka.equals(marka) && auto.model.equals(model))
                System.out.println("Marka : " + auto.marka + ", model : " + auto.model);
    }

    public static Samochod newestCar(List<Samochod> cars) {
        Samochod tmp = cars.get(0);
        for (Samochod autko : cars)
            if (autko.rokProdukcji >= tmp.rokProdukcji) {
                tmp = autko;
            }
        return tmp;
    }

    public static Samochod oldestCar(List<Samochod> list) {
        Samochod tmp = list.get(0);
        for (Samochod autko : list) {
            if (autko.rokProdukcji <= tmp.rokProdukcji) {
                tmp = autko;
            }
        }
        return tmp;
    }
}