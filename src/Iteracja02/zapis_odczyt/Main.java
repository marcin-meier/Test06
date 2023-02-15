package Iteracja02.zapis_odczyt;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        //ODCZYT
        //1. znak po znaku

//        FileReader odczyt = new FileReader("src/iteracja02/zapis_odczyt/test.txt");
//        int znak;
//        while ((znak = odczyt.read()) != -1) {
//            System.out.print((char) znak);
//        }
//        odczyt.close();
//
//        System.out.println();

//        2. linia po linii


//        BufferedReader br = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/test.txt"));
//        String linia;
//
//
//        while ((linia = br.readLine()) != null) {
//            System.out.println(linia);
//        }
//        br.close();

//        TRY WITH RESOURCES


//        try (BufferedReader bri = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/test.txt"));
//             BufferedWriter zapis = new BufferedWriter(new FileWriter("src/iteracja02/zapis_odczyt/test_zapis.txt", true))) {
//
//            String linia1;
//            while ((linia1 = bri.readLine()) != null) {
//                System.out.println(linia1);
//            }
//
//            zapis.write("test2\n");
//        }

        //ZAPIS
        //1. FileWriter


//        FileWriter fw = new FileWriter("src/iteracja02/zapis_odczyt/test_zapis.txt");
//        fw.write("Test\n");
//        fw.write("Test\n");
//        fw.write("Test\n");
//        fw.write("Test\n");
//        fw.close();

//        //2. BufferedWriter
        //Domyślnie zapis do pliku nadpisuje obecny plik, chyba, że zmienimy flagę append na true, wtedy do pliku będziemy dopisywali.
//        try (BufferedWriter zapis = new BufferedWriter(new FileWriter("src/iteracja02/zapis_odczyt/test_zapis.txt", true))) {
//
//        }


//        ---Zapisz do pliku kilka nazw zwierząt, odczytaj je i wypisz na konsoli.
//        try(BufferedWriter zapis = new BufferedWriter(new FileWriter("src/iteracja02/zapis_odczyt/zwierzeta.txt"));
//             BufferedReader br = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/zwierzeta.txt"));){
//            System.out.println("Elo");
//            zapis.write("Kot\n");
//            zapis.write("Pies\n");
//            zapis.write("mysz\n");
//
//
//            String linia;
//            while ((linia = br.readLine()) != null) {
//                System.out.println(linia);
//            }
//        }


        //---Stwórz plik z 10 liczbami, wczytaj je i przypisz do tablicy. Wyświetl ją.
//            try (BufferedReader br = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/liczby1.txt"))) {
//
//                int[] array = new int[10];
//                int i = 0;
//                String linia1;
//                while ((linia1 = br.readLine()) != null) {
//                    array[i] = Integer.parseInt(linia1);
//                    i++;
//                }
//                System.out.println(Arrays.toString(array));
//
//                for (int j = 0; j < 10; j++) {
//                    array[j] = Integer.parseInt(br.readLine());
//                }
//            }


//        try (BufferedReader br = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/liczby2.txt"))) {
//            String linia = br.readLine();
//            if (linia.contains(", ")) {
//                String[] tab = linia.split(", ");
//            } else if (linia.contains("-")) {
//                String[] tab = linia.split("-");
//            }
//            int[] tab2 = new int[tab.length];
//            for (int i = 0; i < tab.length; i++) {
//                tab2[i] = Integer.parseInt(tab[i]);
//            }
//            System.out.println(Arrays.toString(tab2));
//        }

        //---Stwórz program który pozwala zapisać do pliku 3 imiona podane przez użytkownika (JOptionPane)
        //---Następnie je odczytaj i wyświetl najdłuższe z nich na konsoli

//        String[] s = JOptionPane.showInputDialog("Wprowadź 3 imiona po spacji").split(" ");
//        FileWriter fw = new FileWriter("src/iteracja02/zapis_odczyt/imiona.txt");
//
//        String max = s[0];
//        for (int i = 0; i < s.length; i++) {
//            fw.write(s[i] + "\n");
//            if (max.length() < s[i].length()) {
//                max = s[i];
//            }
//        }
//        fw.close();


//        fw.write("Najdluzszy string to: " + max);

        //TODO:
        //---Stwórz plik o nazwie slownik z kilkunastoma wyrazami.
        //---Wśród tych wyrazów wsadź kilka "kurde", "kurka", "kurcze".
        //---Program ma za zadanie zastąpić każde brzydkie słowo gwiazdkami
        //---i zapisać całość do nowego pliku, która nazywa się "slownikPoprawiony".

        try (BufferedWriter dictionary = new BufferedWriter(new FileWriter("src/iteracja02/zapis_odczyt/dictionary.txt"));
             BufferedWriter slownikPoprawiony = new BufferedWriter(new FileWriter("src/iteracja02/zapis_odczyt/slownikPoprawiony.txt"));
             BufferedReader curse = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/dictionary.txt"));) {

            dictionary.write("Marcin\n");
            dictionary.write("Żaba\n");
            dictionary.write("Krzesło\n");
            dictionary.write("Lampa\n");
            dictionary.write("kurde\n");
            dictionary.write("Pies\n");
            dictionary.write("Ptak\n");
            dictionary.write("kurcze\n");
            dictionary.write("Leptyna\n");
            dictionary.write("Wyraz\n");
            dictionary.write("kurka\n");
            dictionary.write("Książka\n");
            dictionary.write("Poduszka\n");
            dictionary.write("zabawka\n");

            dictionary.close();

            String linia1;
            while ((linia1 = curse.readLine()) != null) {
                // tablica Stringów ze słowami brzydkimi i w środku while'a pętla, która idzie po tabie i porównuje.
                if (linia1.equals("kurcze") || linia1.equals("kurde") || linia1.equals("kurka")) {
                    linia1 = "*****";
                    slownikPoprawiony.write(linia1 + "\n");
                }else
                    slownikPoprawiony.write(linia1 + "\n");
            }
        }


//Przy uzyciu Math.random() wygeneruj 100 liczb z zakresu 1-100 i zapisz je do pliku.
//Następnie wczytaj te liczby do tablicy typu int i wyswietl:
// - Najwieksza
// - Najmniejsza
// - Srednia
// - Mediane
// - ilosc powtorzen liczby 13

        try (BufferedWriter write1 = new BufferedWriter(new FileWriter("src/iteracja02/zapis_odczyt/random_number.txt"));
             BufferedReader z = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/random_number.txt"));) {
            int setka = 100;

            for (int i = 0; i < setka; i++) {
                write1.write((int) (Math.random() * 100) + 1 + "\n");
            }
            write1.close();// WAŻNE !!!!!

            int[] arraym = new int[100];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int thirteen = 0;
            int i = 0;
            String linia3;
            while ((linia3 = z.readLine()) != null) {
                arraym[i] = Integer.parseInt(linia3);
                if (arraym[i] > max)
                    max = arraym[i];
                if (arraym[i] < min)
                    min = arraym[i];
                if (arraym[i] == 13)
                    thirteen++;
                i++;
            }
            System.out.println(Arrays.toString(arraym));
            System.out.println(max);
            System.out.println(min);
            System.out.println(thirteen);

        }


        //Wczytaj plik z liczbami (ok. 10 liczb, stwórz go ręcznie) które są rodzielone znakiem tabulacji.
        //Sprawdz czy wczytane liczby były w kolejności rosnącej, malejącej czy były pomieszane.
//[1, 2, 3, 4, 5] -> ROSNACO
//[5, 4, 3, 2, 1] -> MALEJACO
//[1, 3, 2, 5, 4] -> POMIESZANE

        try (BufferedReader ax1 = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/liczby1-10"))) {
            String[] tab = ax1.readLine().split(" ");
            int[] tabLiczb = new int[tab.length];
            for (int i = 0; i < tab.length; i++) {
                tabLiczb[i] = Integer.parseInt(tab[i]);
            }


        }


//W pliku tekstowym "palindromy" są palindromy! :O
//Jest takie słowo, które czytane od tyłu znaczy to samo co od przodu
//kajak; ala
//Wypisz na konsoli te wyrazy, które spełniają powyższy warunek.

        try(BufferedReader palindromy = new BufferedReader(new FileReader("src/iteracja02/zapis_odczyt/palindromy.txt"));){

            String ax;
            while ((ax = palindromy.readLine()) != null) {
                int x = 0;
                for (int i = 0; i < ax.length() / 2; i++) {
                    if (ax.charAt(i) == (ax.charAt(ax.length() - i - 1)))
                        x++;
                }
                if (x == ax.length() / 2)
                    System.out.println(ax);
            }
        }

//amigoscode
//sql
    }
}

