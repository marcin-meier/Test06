package Iteracja02.joptionpane;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int liczba = Integer.parseInt(JOptionPane.showInputDialog("Wpisz liczbe, a ja dodam do niej 5"));
//        System.out.println(liczba + 5);
//
//        int a = JOptionPane.showConfirmDialog(null, "Wpisałeś: " + liczba, "Title okna", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(a);
//        //Tak = 0, Nie = 1, Anuluj = 2
//
//        JOptionPane.showMessageDialog(null, "Fajna liczba", "title", JOptionPane.WARNING_MESSAGE);

        //https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html

        //---Wprowadź za pomocą okienka dialogowego jakiś napis.
        //---Jeśli jego długość jest większa niż 15,
        //---wyświetl za pomocą okienka, że napis jest za długi, a jeśli nie, to wyświetl OK.

//       String ala =  JOptionPane.showInputDialog("Podaj napis");
//
//       if (ala.length() > 15)
//           JOptionPane.showMessageDialog(null, "Napis jest za długi");
//       else
//           JOptionPane.showMessageDialog(null, "OK");

        //---Uzytkownik podaje najpierw ile liczb chce zsumowac, a potem podaje te liczby, wypiszmy sume tych, ich srednia arytmetyczna,
        //---najwieksza liczbe, najmniejsza liczbe.

//        int abc = Integer.parseInt(JOptionPane.showInputDialog("Ile liczb chcesz zsumować ? "));

//        // showInputDialog zwraca Stringa, musimy go więc sparsować do integera

//        int suma = 0;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < abc; i++) {
//            int abc1 = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę numer " + (i + 1)));
//            suma += abc1;
//            if (abc1 > max)
//                max = abc1;
//            if (abc1 < min)
//                min = abc1;
//
//        }
//        System.out.println(suma);
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(suma / abc);


//        String tekst = JOptionPane.showInputDialog("Wpisz imiona po spacji");
//        String[] imiona = tekst.split(" ");
//        System.out.println(Arrays.toString(imiona));


        //TODO:
        //za pomoca joptionpane wczytaj 5 cyfr, zapisz je do tablicy intow i posortuj je malejaco.
        //nastepnie wypisz element najwiekszy, najmnjejszy oraz srednia.

//        int[] array = new int[5];
//        JOptionPane.showMessageDialog(null, "Wypisz po kolei " + array.length + " cyfr", "Witam Cię !", JOptionPane.PLAIN_MESSAGE);
//        int x = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int lesser;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę " + (i + 1)));
//            if (array[i] > 9 && array[i] < 0) {
//                JOptionPane.showMessageDialog(null, "CYFRĘ ! NIE LICZBĘ !", "Error", JOptionPane.ERROR_MESSAGE);
//                i--;
//            } else if (array[i] < 0) {
//                JOptionPane.showMessageDialog(null, "CYFRĘ ! NIE LICZBĘ !", "Error", JOptionPane.ERROR_MESSAGE);
//                i--;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    lesser = array[i];
//                    array[i] = array[j];
//                    array[j] = lesser;
//                }
//            }
//            x += array[i];
//            if (array[i] < min)
//                min = array[i];
//            if (array[i] > max)
//                max = array[i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(x);
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(x / array.length);


//Za pomoca joptionapne wczytaj 5 imion, zapisz je do tablicy stringow.
//na podstawie tej tablicy stworz druga tablice intow, ktora ma taka sama dlugosc.
//uzupelnij nowa tablice dlugosciami imion z pierwszej tablicy.
//np. [jan, ala, monika] i na tej podstawie tworzysz nowa tablice: [3, 3, 6]

//        String[] ala = JOptionPane.showInputDialog("Podaj 5 imion po spacji", "Marek Kuba Seba Waldek Arek").split(" ");
//        int[] ala123 = new int[ala.length];
//        for (int i = 0; i < ala.length; i++) {
//            ala123[i] = ala[i].length();
//        }
//        System.out.println(Arrays.toString(ala));
//        System.out.println(Arrays.toString(ala123));


//za pomoca joptiopane wczytaj 5 cyfr, zapisz je do tablicy intow i sprawdz,
//czy uzytkownik wpisal liczby w kolejnosci rosnacej
//1 2 3 4 5 - OK
//1 2 3 6 5 - NIE

        int[] array = new int[5];
        int lesser = 0;
        // wyskakuje MessageBox
        JOptionPane.showMessageDialog(null, "Wypisz po kolei " + array.length + " cyfr", "Witam Cię !", JOptionPane.PLAIN_MESSAGE);

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę " + (i + 1)));
            //sprawdzamy czy user wpisuje cyfre 0-9, jeśli tak,przypisujemy cyfrę do tablicy array, jeśli nie użytkownik powtarza wpisywanie.
            if (array[i] > 9) {
                JOptionPane.showMessageDialog(null, "CYFRĘ ! NIE LICZBĘ !", "Error", JOptionPane.ERROR_MESSAGE);
                i--;
            } else if (array[i] < 0) {
                JOptionPane.showMessageDialog(null, "CYFRĘ ! DODATNIĄ !", "Error", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }
        //sprawdzamy czy user wpisał liczby w kolejności rosnącej.
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                lesser++;
            }
            if (lesser == array.length - 1) {
                System.out.println("Użytkownik wpisał liczby w kolejności rosnącej");
            }
        }
        if (lesser != (array.length - 1))
            System.out.println("Użytkownik nie wpisał liczb w kolejności rosnącej");

        System.out.println(Arrays.toString(array));
    }
}

