package test01;

import java.util.Arrays;

public class zad2 {
    public static void main(String[] args) {

//        Stworz tablice liczb całkowitych (ile chcesz elementów i jak chcesz)
//        następnie:
//        - wypisz wszystkie elementy tablicy od pierwszego do ostatniego w jednej linii
//        - wypisz wszystkie elementy tablicy od ostatniego do pierwszego w jednej linii
//        - wypisz największy element
//        - wypisz najmniejszy element
//        - wypisz sumę elemetów
//        - wypisz medianę elementów tablicy

        int[] array1 = new int[11];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        float mediana = 0;
        int lesser;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 100) + 1);
            System.out.print(array1[i] + " ");
            if (array1[i] > max)
                max = array1[i];
            if (array1[i] < min)
                min = array1[i];
            sum += array1[i];
        }
        System.out.println();

        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    lesser = array1[j];
                    array1[j] = array1[i];
                    array1[i] = lesser;
                }
            }
            System.out.print(array1[i] + " ");
        }
        if (array1.length % 2 == 0)
//            zostawiłem świadomie +1-1
            mediana = (array1[array1.length / 2 - 1] + array1[array1.length / 2 + 1 - 1]) / 2f;
        else
            mediana = array1[(array1.length - 1) / 2];

        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(mediana);
    }
}
