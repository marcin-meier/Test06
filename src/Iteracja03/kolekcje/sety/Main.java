package Iteracja03.kolekcje.sety;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Set - NIEUPORZĄDKOWANY zestaw UNIKATOWYCH obiektów


        //HashSet - bardzo szybka operacja dodawania, usuwania i wyszukiwania
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("Nowak", "Kowalski", "Nowak", "Stefanski", null));
        System.out.println(set);

        //Brak .get(), wiec tylko for each lub iterator
        for (String s : set) {
            System.out.println(s);
        }

        //LinkedHashSet
        //dodajac kolejne elementy, mamy pewnosc, ze w tej samej kolejnosci mozemy po niej iterowac
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(5, 4, 3, 1, 8, 10, 10, 1));
        System.out.println(set2);

        //TreeSet
        //Sortuje elementy w secie, ale nie akceptuje wartosci null
        //https://pl.wikipedia.org/wiki/Drzewo_czerwono-czarne
        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(2, 13, 5, 3, 6, 3, 7));
        System.out.println(set3);

        // Napisz metode, ktory losuje liczby w duzym lotku (6 sztuk) bez powtorzen, zakres liczb 1-45
        System.out.println("LOTTO:");
        lotto();
        lotto();
        lotto();
        lotto();
        lotto();
        lotto();
        lotto();
        lotto();


        //Stwórz programu, ktory zczyta imiona i zwroci nam do nowego pliku liste imion unikatowych.
        //Wyswietl na ekranie liczbe unikatowych imion

        uniqueNames("src/Iteracja03/kolekcje/sety/imiona");
    }

    public static void lotto() {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        while (set.size() != 6) {
            set.add(random.nextInt(45) + 1);
        }
        System.out.println(set);
    }

    public static void uniqueNames (String pastePath) throws IOException {
        try(BufferedReader a = new BufferedReader(new FileReader(pastePath));
            BufferedWriter b = new BufferedWriter(new FileWriter("src/iteracja03/kolekcje/sety/uniqueNames.txt"));){

            Set<String> imie = new HashSet<>();
            String k;
            while ((k = a.readLine()) != null)
                imie.add(k);
            for(String o : imie)
                b.write(o + "\n");
        }
    }
}


