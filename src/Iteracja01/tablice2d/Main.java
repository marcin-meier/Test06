package Iteracja01.tablice2d;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] macierz = new int[5][5];
        //ilosc wierszy
        System.out.println(macierz.length);
        //ilosc kolumn
        System.out.println(macierz[0].length);

        //[wiersz][kolumna]
        macierz[0][0] = 10;
        macierz[1][1] = 20;
        macierz[2][2] = 30;

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] macierz2 = {{1, 2, 3},
                {4, 5, 6, 7, 8},
                {9, 10, 11, 12}};

        for (int i = 0; i < macierz2.length; i++) {
            for (int j = 0; j < macierz2[i].length; j++) {
                System.out.print(macierz2[i][j] + " ");
            }
            System.out.println();
        }

        //---Zadeklaruj tablicę 2d 4x6 typu String. Przypisz do niej kilka elementów
        //---Wypisz liczbę wierszy i kolumn, jakiś przykładowy element oraz całą macierz

        String[][] tablicaString = new String[4][6];

        tablicaString[1][3] = "Ala";
        tablicaString[3][5] = "ma";
        tablicaString[0][0] = "kota";

        System.out.println(tablicaString.length);
        System.out.println(tablicaString[0].length);

        //iterujemy po wszystkich wierszach
        for (int i = 0; i < tablicaString.length; i++) {
            //iterujemy po wszystkich kolumnach w danym wierszu
            for (int j = 0; j < tablicaString[i].length; j++) {
                System.out.print(tablicaString[i][j] + " ");
            }
            System.out.println();
        }

        //---Zadeklaruj tablicę 2d 6x6 typu int i wypełnij ją liczbami od 10 w góre.
        //---Policz sumę wszystkich elementów w tablicy. Wykorzystaj tylko 2 pętle for!
        //---Pamiętaj o deklaracji zmiennych pomocniczych :)

        int[][] bali = new int[6][6];
        int c = 10;
        int suma = 0;

        for (int i = 0; i < bali.length; i++) {
            for (int j = 0; j < bali[i].length; j++) {
                bali[i][j] = c;
                suma += c;
                c++;
                System.out.print(bali[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(suma);

        //wypisanie szybko tablicy 2d
        System.out.println(Arrays.deepToString(bali));


        //---Wypisz powyższą tablicę w odwrotnej kolejności :)

        //i = 5
        //j = 0
        for (int i = bali.length - 1; i >= 0; i--) {
            for (int j = bali[i].length - 1; j >= 0; j--) {
                System.out.print(bali[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int x = 10;
        System.out.println(x++);//postinkrementacja
        System.out.println(x);

        System.out.println();

        System.out.println(++x);//preinkrementacja
        System.out.println(x);

        System.out.println();
        //---Zadeklaruj tablicę 5x5 typu int i wypełnij ją liczbami losowymi z zakresu 1-10.
        //---Wyświetl sumę wszystkich liczb parzystych, całą tablicę oraz ilość wystąpień elementu 7.

        //Math.random() - [0, 1)
        //Math.random() * (max - min) + min
        //(int) <- castowanie do okreslonego typu "w locie"
        System.out.println((int) (Math.random() * 59) + 1);


        System.out.println();
        //Random
        Random random = new Random();
        //0-9 -> 1-10
        //random.nextInt(10) ---> [0, 10)
        //random.nextInt(max-min) + min
        System.out.println(random.nextInt(10) + 1);
        System.out.println();

        int[][] elvis = new int[5][5];

        for (int i = 0; i < elvis.length; i++) {
            for (int j = 0; j < elvis[i].length; j++) {
                elvis[i][j] = random.nextInt(10) + 1;
            }
        }

        System.out.println(Arrays.deepToString(elvis));

        //TODO:
        //Napisz program który tworzy tablicę 2d 5x5, uzupełnia ją liczbami naturalnymi
        //od liczby podanej przez użytownika (jako zmienna) w dół i liczy sumę wszystkich wprowadzonych liczb.


//        int[][] one = new int[5][5];
//        Scanner typeIn = new Scanner(System.in);
//        int o = typeIn.nextInt();
//        int sum1 = 0;
//
//
//        for (int i = 0; i < one.length; i++) {
//            for (int j = 0; j < one[i].length; j++) {
//                one[i][j] = o;
//                sum1 += o;
//                if (o > 0)
//                    o--;
//                System.out.print(one[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(sum1);


        //Napisz program, który tworzy tablicę 2d 5x5 i uzupełnia ją kolejnymi liczbami naturalnymi zaczynając od 10.
        //Wypisz z tej tablicy przekątne od lewej górnej do prawej dolnej

        int[][] pow = new int[5][5];
        int o1 = 10;

        for (int i = 0; i < pow.length; i++) {
            for (int j = 0; j < pow[i].length; j++) {
                pow[i][j] = o1;
                if (i == j)
                    System.out.print(pow[i][j] + " ");
                else System.out.print("  ");
                o1++;


            }
            System.out.println();
        }

        System.out.println();
        //Napisz program który tworzy tablicę dwuwymiarową 8x8 i uzupelnia ją liczbami podzielnymi
        //przez 3 zaczynając od 10, wypisz całą macierz. Następnie wypisz macierz w ten sposób, że
        //liczby które są podzielne przez 4 wypisujemy, a jeśli nie to wstawiamy w ich miejsce liczbę -1.


        int[][] array6 = new int[6][6];
        int b = 10;
        int n = -1;


        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (b % 3 == 0) {
                    array6[i][j] = b;
                    System.out.print(array6[i][j] + " ");
                } else
                    j--;
                b++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j] % 4 == 0) {
                    System.out.print(array6[i][j] + " ");
                } else
                    System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}

