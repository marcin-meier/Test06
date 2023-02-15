package Iteracja01.tablice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] tab = new int[5];
        tab[0] = 10;
        tab[1] = 20;
        tab[2] = 30;
        tab[3] = 40;
        tab[4] = 50;

        System.out.println("Element na indexie 0 to: " + tab[0]);
        System.out.println("Wielkosc tablicy to: " + tab.length);

        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println();

        int[] testTab = new int[10];
        for (int i = 0; i < testTab.length; i++) {
            testTab[i] = i + 5;
            System.out.print(testTab[i] + " ");
        }
        System.out.println();

        int[] smallTab = {1, 2, 3};
        int[] bigTab = new int[2 * smallTab.length];

        System.out.println(smallTab.length);
        for (int i = 0; i < smallTab.length; i++) {
            bigTab[i] = smallTab[i];
        }

        for (int i = 0; i < bigTab.length; i++) {
            System.out.print(bigTab[i] + " ");
        }

        System.out.println();
        int[] xxx = new int[10];
        for (int i = 0; i < xxx.length; i++) {
            System.out.print(xxx[i] + " ");
        }

        System.out.println();
        String[] tabString = new String[10];
        for (int i = 0; i < tabString.length; i++) {
            System.out.print(tabString[i] + " ");
        }
        System.out.println();

        int[] tab3 = new int[5];
        int[] tab4 = tab3;

        // Oblicz sume elementow tablicy doubli ale tylko tych ktore sa wieksze niz 3.8
        // oblicz sumę elementów ktore sa podzielne przez 3
        // Oblicz sume elementow ale tylko tych ktore stoja na nieparzystych indeksach
        double[] tab5 = {1, 2, 3, 4, 7};
        double suma = 0;
        double sumaPodzielnePrzez3 = 0;
        double sumaNieparzystych = 0;


        //szybsze wypisanie zawartosci calej tablicy
        System.out.println(Arrays.toString(tab5));
        System.out.println(tab5);

        for (int i = 0; i < tab5.length; i++) {
            if (tab5[i] > 3.8) {
                suma += tab5[i];
            }
            if (tab5[i] % 3 == 0) {
                sumaPodzielnePrzez3 += tab5[i];
            }
            if (i % 2 != 0) {
                sumaNieparzystych += tab5[i];
            }
        }
        System.out.println("Suma elementow wiekszych niz 3.8 to: " + suma);
        System.out.println("Suma elementow podzielnych przez 3: " + sumaPodzielnePrzez3);
        System.out.println("Suma elementow na indeksach nieparzystych: " + sumaNieparzystych);

        //TODO:
        //---Zadeklaruj tablicę Stringów dwoma sposobami, przypisz do nich wartości, wypisz ich długość h parę elementów.

        String[] alaMaPsa = {"mleko", "kot", "pies"};
        System.out.println(alaMaPsa.length);
        System.out.println(alaMaPsa[0]);
        System.out.println(alaMaPsa[1]);

        System.out.println();

        String[] alaMaKota = new String[6];
        alaMaKota[0] = "lipa";
        alaMaKota[1] = "lizak";
        System.out.println(alaMaKota.length);
        System.out.println(alaMaKota[0]);
        System.out.println(alaMaKota[1]);


        //---Zadeklaruj tablicę intów h przypisz do niej 8 liczb.
        //---1) wyświetl całą tablicę
        Integer[] tabz = new Integer[8];
        int total = 0;

        tabz[0] = 5;
        tabz[1] = 2;
        tabz[2] = 55;
        tabz[3] = 14;
        tabz[4] = 1;
        tabz[5] = 78;
        tabz[6] = 114;
        tabz[7] = 3;

        for (int i = 0; i < tabz.length; i++) {
            System.out.print(tabz[i] + " ");
        }
        System.out.println();
//        LUB
        System.out.println(Arrays.toString(tabz));

//---2) wyświetl tylko liczby większe od 4

        for (int i = 0; i < tabz.length; i++) {
            if (tabz[i] > 4) System.out.print(tabz[i] + " ");
        }
        System.out.println();

//---3) wyświetl sumę wszystkich elementów w tablicy

        for (int i = 0; i < tabz.length; i++) {
            total += tabz[i];
        }
        System.out.println(total);

//---4) wyświetl największy element w tablicy
        int max = Integer.MIN_VALUE;
        // w przypadku gdy mamy do czynienia z liczbami ujemnymi musimy użyć Integer.MIN_VALUE
        for (int i = 0; i < tabz.length; i++) {
            if (tabz[i] > max) {
                max = tabz[i];
            }
        }
//        int max = Collections.max(Arrays.asList(tabz));
        System.out.println(max);


        // Zadeklaruj tablicę intów długości 5 h wypełnij ją dowolnymi liczbami.
        // Wyświetl całą tablicę w pętli for h while.

        Integer[] hi1 = new Integer[5];
        Random random1 = new Random();

        for (int i = 0; i < hi1.length; i++) {
            hi1[i] = random1.nextInt(100) + 1;
            System.out.print(hi1[i] + " ");
        }

        System.out.println();

        int i = 0;
        while (i < hi1.length) {
            hi1[i] = random1.nextInt(100) + 1;
            System.out.print(hi1[i] + " ");
            i++;
        }
        System.out.println();


        // Zadeklaruj tablice stringow dlugosci 4, dodaj do niej 4 wyrazy.
        // W petli przypisz kazdy wyraz do wczesniej utworzonej zmiennej
        // typu string. Wyswietl ta zmienna

        String[] strings123 = new String[4];
        String[] mokebe123 = new String[4 + strings123.length];
        System.out.println(mokebe123.length);

        mokebe123[4] = "ala";
        mokebe123[5] = "ma";
        mokebe123[6] = "wielkiego";
        mokebe123[7] = "kota";

//        String rrr = "";
//        for (int j = 0; j < mokebe123.length; j++) {
//            rrr += mokebe123[i];
//        }
        for (int r = 0; r < strings123.length; r++) {
            strings123[r] = mokebe123[r];
        }
        for (int j = 0; j < mokebe123.length; j++) {
            System.out.print(mokebe123[j] + " ");
        }
        System.out.println();

        // Zadeklaruj tablice intow dlugosci 100, wypelnij ja w petli liczbami
        // od 0 do 99.
        // Wyswietl z niej tylko liczby wieksze niz 56.

        Integer[] Arrays1234 = new Integer[100];
        Random random2 = new Random();

        System.out.println(Arrays1234.length);

        for (int j = 0; j < Arrays1234.length; j++) {
            Arrays1234[j] = random2.nextInt(99);
            if (Arrays1234[j] > 56)
                System.out.print(Arrays1234[j] + " ");
        }
        System.out.println();

        /*
         * Zadanie 1
         * Stwórz tablice intow (jak chcesz h ile chcesz) h policz ile w sumie jest w niej elementów parzystych.
         * Np.: [2, 1, 2, 3, 4] --> 3
         */

        Integer[] volume123 = new Integer[15];
        int suma1 = 0;

        for (int j = 0; j < volume123.length; j++) {
            volume123[j] = random2.nextInt(50) + 1;
            System.out.print(volume123[j] + " ");
            if (volume123[j] % 2 == 0)
                suma1 += 1;
            //suma1++;
        }
        System.out.println();
        System.out.println(suma1);

        /* Zadanie 2
         * Stworz tablice intow (jak chcesz h ile chcesz) h zwróć true jeśli tablica zawiera dwie liczby 7 obok siebie.
         * Np.: [1, 7, 7] --> true
         * [1, 7, 1, 1, 7] --> false
         */
        Integer[] aed123 = new Integer[15];
        boolean dwie7Obok;

        for (int j = 0; j < aed123.length; j++) {
            aed123[j] = random2.nextInt(10) + 1;
            System.out.print(aed123[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < aed123.length - 1; j++) {
            if (aed123[j] == 7 && aed123[j].equals(aed123[j + 1])) {
                dwie7Obok = true;
                System.out.println(dwie7Obok);
            } else dwie7Obok = false;
        }
        System.out.println();


        /* Zadanie 3
         * Stworz tablice intow (jak chcesz h ile chcesz) h zwróć nową tablicę ze wszystkimi elementami,
         * które występują po ostatniej 4 w tablicy.
         * Np.: [2, 4, 1, 2] --> [1, 2]
         * [4, 1, 4, 2] --> [2]
         * [4, 4, 1, 2, 3] --> [1, 2, 3]
         */
        int[] array3 = {4, 2, 1, 4,  3, 5};
        int totalx = 0;
        int totalk = 0;

        for (int j = 0; j < array3.length; j++) {
            if (array3[j] == 4)
                totalx++;
            System.out.print(array3[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < array3.length; j++) {
            if (array3[j] == 4)
                totalk++;
            if (array3[j] == 4 && totalk == totalx)
                for (int k = j + 1; k < array3.length; k++) {
                    System.out.print(array3[k] + " ");
                }
        }

        //rozwiazanie mm
        int[] nowaTablica;
        System.out.println("ZADANIE Z 4");
        for (int j = array3.length - 1; j >= 0; j--) {
            if (array3[j] == 4) {
                nowaTablica = new int[array3.length - j - 1];
                for (int k = 0; k < nowaTablica.length; k++) {
                    nowaTablica[k] = array3[j + k + 1];
                }
                System.out.println(Arrays.toString(nowaTablica));
                break;
            }
        }


        System.out.println();


        System.out.println();
        /* Zadanie 4
         * Napisz program, który sortuje podaną tablicę intów w sposób rosnący.
         * Np.: [5, 2, 3, 1] --> [1, 2, 3, 5]
         * UWAGA! NIE UŻYWAJ ŻADNYCH GOTOWYCH METOD!
         */
        int[] tab121 = {5, 3, 2};
        int lesser;

        for (int j = 0; j < tab121.length; j++) {
            for (int k = j + 1; k < tab121.length; k++) {
                if (tab121[j] > tab121[k]) {
                    lesser = tab121[k];
                    tab121[k] = tab121[j];
                    tab121[j] = lesser;
                }
            }
        }
        for (int j = 0; j < tab121.length; j++) {
            System.out.print(tab121[j] + " ");
        }

        System.out.println();




        /*
         * Zadanie 5
         * Napisz program, który liczy ile razy wystąpiło słowo "hi" w danym Stringu.
         * Np.: "abc hi ho" --> 1
         * "ABChi hi" --> 2
         */

        String sentence = "A hi abc hi vsd hi as hi";

        int hiWord = 0;

        for (int j = 0; j < sentence.length() ; j++) {
            if (sentence.charAt(j) == 'h' && sentence.charAt(j+1) == 'i'){
                hiWord++;
            }

        }
        System.out.println(hiWord );



//        String x = "ABC";
//        String y = "abc";
//        for (
////
//        StringPoolint h = 0; h < x.length(); h++) {
//            System.out.println(x.charAt(h));
//        }
//        System.out.println(x.equals(y));
//
//        System.out.println(x.equalsIgnoreCase(y));
    }
}

