package Iteracja01.instrukcje;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //if (warunek) {
        //  jakas operacje jesli warunek = true
        //}

//        int i = 5;
//        if (i < 10) {
//            System.out.println("Podana liczba jest mniejsza niz 10");
//        } else if (i == 10) {
//            System.out.println("Podana liczba jest rowna 10");
//        } else {
//            System.out.println("Podana liczba jest wieksza niz 10");
//        }

        /*
        = - przypisanie
        == - równa się
        != - negacja
        && - and (logiczne i)
        || - or (logiczne lub)
        % - modulo, reszta z dzielenia
        < >  <=   >=
         */

        int a = 1, b = 5;
        if ((a > 2 && b > 10) || a == 1) {
            System.out.println("AND OK");
        } else {
            System.out.println("AND NIE OK :(");
        }

        if (a > 2 || b > 10) {
            System.out.println("OR OK");
        } else {
            System.out.println("OR NIE OK");
        }

        //---Zrób przykładową instrukcję warunkową dla 2 intów:
        int c = 5;
        int d = 5;
        //---Jeśli c jest większe od d to wyświetl komunikat: "Liczba 'c' jest większa od 'd' o '200'"
        //---Jeśli c jest równe d to wyświetl komunikat: "Liczby są sobie równe"
        //---Jeśli c jest mniejsze od d to wyświetl komunikat: "Liczba 'd' jest większa od 'c' o '100'"

        if (c > d) {
            System.out.println("Liczba " + c + " jest większa od " + d + " o " + (c - d));
        } else if (c == d) {
            System.out.println("Liczby są równe");
        } else {
            System.out.println("Liczba " + d + " jest większa od " + c + " o " + (d - c));
        }

        System.out.println();
        //SWITCH CASE
        int ocena = 3;
        switch (ocena) {
            case 2:
                System.out.println("Dostales 2");
                break;
            case 3:
                System.out.println("Dostales 3");
                break;
            case 4:
                System.out.println("Dostales 4");
                break;
            case 5:
                System.out.println("Dostales 5");
                break;
            default:
                System.out.println("Nie znam takiej oceny :(");
        }
        System.out.println("...");

        //---Zrób instrukcję SWITCH CASE, dla wartości String, która przyjmie jedną z 4 pór roku
        //---W zależności od pory roku wyświetl na konsoli czy jest ciepło.
        //---Np.: Lato - jest super ciepło
        //---Zima - jest super zimno;

        String poraRoku = "Latox";

        switch (poraRoku) {
            case "Wiosna":
                System.out.println("Jest Wiosna");
                break;
            case "Lato":
                System.out.println("Jest Lato");
                break;
            case "Jesień":
                System.out.println("Jest Jesień");
                break;
            case "Zima":
                System.out.println("Jest Zima");
                break;
            default:
                System.out.println("Nieprawidłowa nazwa pory roku");
        }

        //MODULO
        System.out.println("Reszta z dzielenia " + (8 % 5));

        //---Zrób instrukcję warunkową, która sprawdza czy podana liczba jest parzysta.
        int liczba = 3;
        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta");
        } else {
            System.out.println("Liczba " + liczba + " nie jest parzysta");
        }

        //---Sprawdz czy podana liczba typu double jest dodatnia, czy jest równa 0, czy jest ujemna
        double liczba2 = 0;

        if (liczba2 < 0) {
            System.out.println("ujemna");
        } else if (liczba2 == 0) {
            System.out.println("równa 0");
        } else {
            System.out.println("dodatnia");
        }

        //---Sprawdz czy podana liczba typu double należy do przedziału (1,4) lub <6,8> czy jest spoza przedziału.
        double e = 1.1;
        if (e > 1 && e < 4) {
            System.out.println("liczba zawiera się w przedziale (1, 4)");
        } else if (e >= 6 && e <= 8) {
            System.out.println("liczba zawiera się w przedziale <6,8>");
        } else {
            System.out.println("spoza przedziału");
        }

        //---Sprawdz czy średnia dwóch liczb typu double jest większa niż 4:
        double f = 4, g = 5;
        double srednia = (f + g) / 2;
        if (srednia > 4) {
            System.out.println("większa");
        } else if (srednia == 4) {
            System.out.println("równa");
        } else {
            System.out.println("mniejsza");
        }

//        int s = 1 + 2 + 3;
//        if (s % 3 == 0)

        //---Sprawdz czy długość podanego Stringa jest większa od 5
        String dupa = "dupasdasda";
        if (dupa.length() > 5) {
            System.out.println("jest wieksza od 5");
        } else {
            System.out.println("nie jest wieksza niz 5");
        }

        System.out.println();
        System.out.println();


        //TODO:
        //Wykorzystując instrukcję warunkową IF sprawdź która z 3 liczb typu int jest NAJMNIEJSZA.
        //Wykorzystując instrukcję warunkową IF wyświetl która z 3 liczb typu int jest:
        //NAJMNIEJSZA
        //NAJWIĘKSZA
        //ŚRODKOWA
        //Przykładowy output:
        //Najmniejszą liczbą jest 0
        //Średnią liczbą jest 3
        //Największą liczbą jest 5

//        int q = 80, o = 5, p = -1;
//
//        if (q < o && q < p) {
//            System.out.println("najmniejszą liczbą jest " + q);
//            if (o > p) {
//                System.out.println("średnią liczbą jest " + p);
//                System.out.println("największą liczbą jest " + o);
//            } else {
//                System.out.println("średnią liczbą jest " + o);
//                System.out.println("największą liczbą jest " + p);
//            }
//        } else if (o < p && o < q) {
//            System.out.println("najmniejszą liczbą jest " + o);
//            if (q < p) {
//                System.out.println("średnią liczbą jest " + q);
//                System.out.println("największą liczbą jest " + p);
//            } else {
//                System.out.println("średnią liczbą jest " + p);
//                System.out.println("największą liczbą jest " + q);
//            }
//        } else {
//            System.out.println("najmniejszą liczbą jest " + p);
//            if (o < q) {
//                System.out.println("średnią liczbą jest " + o);
//                System.out.println("największą liczbą jest " + q);
//            } else {
//                System.out.println("średnią liczbą jest " + q);
//                System.out.println("największą liczbą jest " + o);
//            }
//        }


        //Masz podane 2 zmienne:
        //int speed; (od 1 do 250)
        //boolean isBirthday
        //Złapała Cię policja, w zależności od Twojej prędkości dostajesz mandat:
        //Mniej niż 50km/h - brak mandatu
        //51km/h - 80km/h - średni mandat
        //Jeśli 81km/h - 100km/h - duży mandat
        //Powyżej 100 km/h - zabranie prawka.
        //Natomiast jeśli masz w tym dniu urodziny (isBirthday = true), twoja prędkość może być większa o 5km/h :)
        //Przetestuj ten scenariusz z różnymi zestawami danych


//        int speed = 105;
//        boolean myBirthday = false;
//
//        if (myBirthday) {
//              speed -= 5;
//        }
//
//        if (speed <= 50 || speed <= 55 && myBirthday == true) {
//            System.out.println("brak mandatu");
//        } else if (speed > 50 && speed <= 80 || (speed > 50 && speed <= 85 && myBirthday == true)) {
//            System.out.println("średni mandat");
//        } else if (speed > 80 && speed <= 100 || (speed > 80 && speed <= 105 && myBirthday == true)) {
//            System.out.println("duży mandat ");
//        } else {
//            System.out.println("zabranie prawka");
//        }


        //Masz podane 3 zmienne typu int
        //Jeśli przynajmniej DWIE liczby mają taką samą osatatnią cyfrę (np. 13 i 33) to zwróc jakiś komunikat z tymi liczbami
        int k = 11, j = 43, l = 33;
//               JAK NAPISAĆ, gdy jest brak jakiejkolwiek pary ????????

//        if (k % 10 == j % 10 && j % 10 == l % 10 && k % 10 == l % 10) {
//            System.out.print("Wszystkie trzy liczby " + k + ", " + j + ", " + l + " mają jednakową ostatnią cyfrę");
//        } else if (k % 10 == i && l % 10 == i) {
//            System.out.print("Liczby " + k + " i " + l + " mają jednakową ostatnią cyfrę");
//        } else if (j % 10 == i && l % 10 == i) {
//            System.out.print("Liczby " + j + " i " + l + " mają jednakową ostatnią cyfrę");
//        } else if (k % 10 == i && j % 10 == i) {
//            System.out.print("Liczby " + k + " i " + j + " mają jednakową ostatnią cyfrę");
//        }

    }


}







