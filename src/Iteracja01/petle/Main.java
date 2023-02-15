package Iteracja01.petle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //for (int i = 0; i < 5; i++) {
        // jakas insturkcja ktora ma sie wykonac
        //}

        //fori + tab
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
//            Thread.sleep(1000);
        }

        //while (warunek) {
        // xxx
        //}

        int y = 0;
        while (y < 10) {
            System.out.println("HELLO");
            y++;
        }

        int zzz = 4;
        do {
            System.out.println(zzz);
            zzz--;
        } while (zzz >= 0);

        //---Stwórz 2 pętle: for i while, które wypiszą
        //---na konsoli liczby od 1 do 20, oddzielone przecinkiem

        for (int i = 1; i <= 20; i++) {
            if (i == 20) {
                System.out.println(i);
            } else {
                System.out.println(i + ", ");
            }
        }

        System.out.println(" ");

        //TODO:
        //---Wypisz na konsoli liczby od 20 do 1, oddzielone tabulatorem


        for (int i = 20; i > 0; i--) {
            System.out.print(i + "    "); //zamiast 4 spacji lepiej \t
        }

        System.out.println(" "); //wystarczy sam sout() lub \n
        System.out.println(" ");


        //---Za pomocą pętli While wypisz liczby od 1 do 20, ale dla każdej liczby większej niż 10 dodaj napis "duża liczba".
        int ą = 1; //NIE UZYWAMY POLSKICH ZNAKOW W NAZWACH ZMIENNYCH!

        while (ą < 21) {
            if (ą > 10) {
                System.out.print("duża liczba ");
            }
            System.out.println(ą);
            ą++;
        }

        System.out.println(" ");

        //---Wypisz wszystkie liczby parzyste z zakresu 1-30

        int ó = 1;
        while (ó < 31) {
            if (ó % 2 == 0) {
                System.out.println(ó);
            } else System.out.print("");
            ó++;
        }


        System.out.println(" ");

        //---Wypisz liczby od 40 do 3 w dół za pomocą pętli while

        int ź = 40;
        while (ź > 2) {
            System.out.println(ź);
            ź--;
        }

        System.out.println(" ");
        //---Napisz program, który wypisuje liczby od n do 50 gdzie n jest zmienna
        //---wartoscia podana przez uzytkownika, które są nieparzyste.
        //int n = 14;// wartosc podana przez uzytkownika

        //gol = n
//        for (int gol = 14 ; gol < 51; gol++) {
//            if (gol % 2 != 0){
//                System.out.println(gol);
//            }else{
//                System.out.print("");
//            }
//        }


        //---Napisz program, ktory liczy pole kwadratu dla boku n, który
        //---przyjmuje wartosci od 1 do 10, uzyc petli while

        int t = 3;
        while (t > 0 ){
            if (t >= 1 && t <= 10){
                System.out.println(t*t);
            }else{
                System.out.println("Wartość spoza przedziału");
            }
            break; //break? ta petla wykona sie tylko raz.
        }

        System.out.println(" ");


        //---Napisz program, który zsumuje liczby od 1 do 10 i wyświetli sumę na samym końcu.

//        double a1 = 1;
//        double an = 10;

//        System.out.println((a1 + an) /2 *an  );

        int suma = 0;

        for (int a1 = 1; a1 < 11 ; a1++) {
            suma = suma + a1;
            //suma += a1
        }
        System.out.println("suma wynosi " + suma);


        //---Napisz program, który narysuje wypełniony prostokąt o wymiarach 10x5

        int a1 = 10, a2 = 5;
        for (int t1 = 0; t1 < a1; t1++) {
            for (int f = 0; f < a2; f++) {
                System.out.print("?");
            }
            System.out.println();
        }


        //Napisz program który oblicza potęgę 2^n, gdzie n podaje użytkownik.
        //Dla n = 10, wynik to 2^10 = 1024

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj wartość");
//        int t = scanner.nextInt();
//        System.out.println(Math.pow(2, t));


        //Napisz program który sumuje liczby z zakresu 1-40 ale tylko te które są podzielne przez 3.

//        int suma = 0;
//
//        for (int t = 1 ; t < 41; t++) {
//            if (t % 3 == 0){
//                suma += t;
//            }else suma += 0;
        //else w tym przypadku jest zbędne
//
//        }
//        System.out.println(suma);

//        int a1 = 10, a2 = 4;
//
//        for (int i = 1; i <  ; i++) {
//
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość");

        double x = scanner.nextDouble();

        System.out.println(Math.pow(2, x));

    }
}

