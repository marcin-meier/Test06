package Iteracja02.scanner;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        //NextLine zbiera wszystko, natomiast next int chce tylko liczby, więc ten Enter na końcu zostawia
//        System.out.println("Podaj jakas liczbe naturalna");
//        int input = scanner.nextInt();
//        System.out.println(input);
//
//        System.out.println("Podaj imie");
//        String imie = scanner.nextLine();
//        System.out.println(imie);
//        System.out.println("TEST");


        //TODO:
        //---Wczytaj skanerem 3 liczby typu int, wyswietl ich sume na konsoli

//        int sum = 0;
//        Scanner scanner1 = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            sum += scanner1.nextInt();
//        }
//        System.out.println(sum);


        //---Stwórz prosty kalkulator, użytkownik wprowadza liczbę (double), znak(+, -, *, /) i drugą liczbę (double)
        //---W zależności od podanego znaku, wykonujemy taką operację matematyczną.
        //---Wykorzystaj SWITCH CASE;
//        System.out.println("Podaj 1 liczbę");
//
//        Scanner scanner1 = new Scanner(System.in);
//
//        double x = scanner1.nextDouble();
//        scanner1.nextLine();
//
//        System.out.println("Podaj znak");
//        String znak = scanner1.nextLine();
//
//        System.out.println("Podaj 2 liczbę");
//        double y = scanner1.nextDouble();
//
//
//        switch (znak){
//            case "/":
//                System.out.println(x/y);
//                break;
//            case "*":
//                System.out.println(x*y);
//                break;
//            case "+":
//                System.out.println(x+y);
//                break;
//            case "-":
//                System.out.println(x-y);
//                break;
//            default:
//                System.out.println("Niepoprawnie wpisany znak !");
//        }


        //---Napisz program, gdzie użytkownik najpierw deklaruje ilość liczb do wprowadzenia.
        //---Następnie wprowadza tyle liczb ile podał.
        //---Wyświetl na konsoli ich sumę, element najmniejszy, nawiększy oraz średnią arytmetyczną :)

        Scanner scanner1 = new Scanner(System.in);
//
//
//        System.out.println("Proszę podaj ilość liczb ile chcesz wprowadzić");
//        int x = scanner1.nextInt();
//        int[] ints = new int[x];
//        System.out.println("Podaj te liczby");
//
//        int suma = 0;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = scanner1.nextInt();
//            suma += ints[i];
//            if (ints[i] > max)
//                max = ints[i];
//            if (ints[i] < min)
//                min = ints[i];
//        }
//        System.out.println(Arrays.toString(ints));
//        System.out.println("Suma wynosi " + suma);
//        System.out.println("Średnia wynosi " + (suma / x));
//        System.out.println("Max wynosi " + max);
//        System.out.println("Min wynosi " + min);


        //---Symulacja wprowadzania hasla przez uzytkownika. Uzytkownik wprowadza hasło, jesli bedzie
        //---niepoprawne, wyswietlamy napis ze haslo jest niepoparwne, wprowadz poprawne hasło.
        //---Jesli uzytkownik wprowadzi poprawne haslo to wyswietlamy komunikat ze haslo jest poprawne.

        String password = "Pasek123";
//        int x = 123;
//        String liczba = "10@";
//        liczba += 20;
//        int aaa = Integer.parseInt(liczba);
//        System.out.println(liczba);
//        Scanner scanner1 = new Scanner(System.in);
//        boolean czyHasloOk = true;
//        while (czyHasloOk) {
//            System.out.println("Podaj haslo");
//            String input = scanner1.nextLine();
//            if (password.equals(input)) {
//                System.out.println("HASLO OK");
//                czyHasloOk = false;
//            }
//        }
        //mozna dac flage, lub po prostu zrobic nieskonczona petle i dac break w odpowiednim miejscu.


        //Napisz program, która za pomocą Scannera wczyta 3 Stringi i sprawdzi, który jest
        //najdluższy

//        Scanner scanner2 = new Scanner(System.in);
//        String[] ala1 = new String[3];
//        int max = Integer.MIN_VALUE;
//        System.out.println("Wypisz 3 wyrazy");
//        for (int i = 0; i < ala1.length; i++) {
//            ala1[i] = scanner2.nextLine();
//            if (ala1[i].length() > max)
//                max = ala1[i].length();
//        }
//        for (String s : ala1) {
//            if (s.length() == max)
//                System.out.println(s);
//        }
//        Rozwiązanie Michała      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//        String sMax = ""; //smax = tab[0]
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Wprowadz " + (i+1) + " slowo");
//            String input = scanner2.nextLine();
//            if (input.length() > sMax.length()) {
//                sMax = input;
//            }
//        }
//        System.out.println(sMax);


                /*
        Stwórz grę, w której losowana jest liczba całkowita z zakresu [0; 100]. Użytkownik bez
        wiedzy o liczbie wylosowanej próbuje odgadnąć jaka to. Wykonując sprawdzenie dopóki
        gracz nie zgadnie, informuj go czy wpisana przez niego liczba była większa czy mniejsza
        od wylosowanej. Możesz dodać utrudnienie w postaci ograniczonej liczby prób
        odgadnięcia.
         */

//        Random random1 = new Random();
//        int x = random1.nextInt(100);
//        boolean ax = true;
//        int x123;
//        int stop = 5;
//
//
//        while (ax) {
//            System.out.println("Podaj liczbę do odgadnięcia. Masz " + stop + " attempt");
//            x123 = scanner1.nextInt();
//            if (x123 == x) {
//                System.out.println("Odgadnąłeś liczbę ! Gratuluję");
//                ax = false;
//            } else if (x123 < x) {
//                System.out.println("Wylosowana liczba jest większa");
//            } else
//                System.out.println("Wylosowana liczba jest mniejsza");
//            stop--;
//            if (stop == 0) {
//                ax = false;
//                System.out.println("GAME OVER");
//                System.out.println("Prawdidłową liczba była : " + x);
//
//            }
//        }


        //TODO z gwiazdka :)
        //Gra w kółko i krzyżyk dla dwóch graczy. uzyj scannera
        /*

        _O_|_X_|_O_
        ___|___|____
        ___|___|____
         */

    }
}

