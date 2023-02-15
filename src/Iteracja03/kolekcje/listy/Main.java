package Iteracja03.kolekcje.listy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Podstawowy podzial kolekcji:
        //Lista - uporządkowana kolekcja obiektów, które są numerowane za pomocą indeksów
        //Zbiory - zgodnie z mat. def. zbioru są to kolekcje UNIKATOWYCH obiektow
        //Mapy - kolekcje przechowujace dane na zasadzie KLUCZ-WARTOSC, gdzie klucz jest UNIKATOWYM identyfikatorem
        //Kolejki - specyficzny typ listy, np. kolejka w sklepie

        //ARRAYLIST
        //1) Przechowuje elementy w dynamicznej tablicy - nie podajemy jej rozmiaru
        //2) Dane zapisywane w pamięci znajdują się obok siebie
        //3) Operacja wyjecia jest szybsza niż na LinkedLiscie, ale usuniecie jest wolniejsze.
        List<String> imiona = new ArrayList<>();
        //add() - dodaje cos do kolekcji
        imiona.add("Jan");
        imiona.add("Stefan");
        imiona.add("Marcin");

        System.out.println(imiona);

        //size() - rozmiar kolekcji
        System.out.println(imiona.size());

        //get(x) - zwraca element o indeksie x
        System.out.println(imiona.get(0));

        //set(x, element) - zastepuje element na indeksie x, nowym elementem
        imiona.set(0, "Jan2");
        System.out.println(imiona);

        //addAll() - dodaje kolekcje do kolekcji
        List<String> imiona2 = new ArrayList<>();
        imiona2.add("Jas");
        imiona2.add("Kasia");

        imiona.addAll(imiona2);

        //Arrays.asList() - tworzy z elementow oddzielonych przecinkami kolekcje
        List<String> imiona3 = Arrays.asList("XXX", "AAA", "BBB");
        imiona.addAll(Arrays.asList("Bartek", "Tomek", "Krzys","karolina"));
        System.out.println(imiona);

        for (int i = 0; i < imiona.size(); i++) {
            System.out.print(imiona.get(i) + " ");
        }
        System.out.println();
        for (String s : imiona) {
            s += ":)";
            System.out.print(s + " ");
        }
        System.out.println();

        //Iterator
        //pozwala na iterowanie po kolekcjach
        //next() - zwraca nastepny element iteratora
        //hasNext() - zwraca true, do momentu jezeli cos znajduje sie w iteratorze
        Iterator<String> iterator = imiona.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //contains(x) - zwraca true, jesli element x znajduje sie w kolekcji
        System.out.println(imiona.contains("Marcin"));

        if (imiona.contains("Marcin")) {
            System.out.println("JEST W SRODKU");
        } else {
            System.out.println("NIE MA GO :(");
        }

        //remove(x) - usuniecie z kolekcji elementu x lub indeksu x
        imiona.remove("Jan2");
        imiona.remove(0);
        System.out.println(imiona);

        //removeAll() - usuniecie z kolekcji innej kolekcji
        imiona.removeAll(Arrays.asList("Marcin", "Jas", "Kasia"));

        //isEmpty() - zwraca true jesli kolekcja jest pusta
        System.out.println(imiona.isEmpty());

        imiona.add("Bartek");
        System.out.println(imiona);
        //indexOf(x) - zwraca indeks pierwszego wystapienia elementu x
        System.out.println(imiona.indexOf("Bartek"));
        //lastIndexOf(x)
        System.out.println(imiona.lastIndexOf("Bartek"));

        String string = imiona.toString();
        System.out.println(string);

        //clear() - czysci cala kolekcje
        //subList<x, y) - zwraca podliste od indeksu podanego jako pierwszy (UWZGLEDNIAJAC GO)
        //do indeksu podanego jako drugi (NIEUWZGLEDNIAJAC GO)
        System.out.println(imiona.subList(1, 3));


        String test = "ALAMAKOTA";
        System.out.println(test.substring(1, 3));

        //getClass() - zwraca reprezentacje klasowa kolekcji
        System.out.println(imiona.getClass().getSimpleName());

        //equals() - zwraca true jesli dwie kolekcje sa identyczne
        //list1.equals(list2)

        //LINKEDLIST
        //1) Przechowuje wewnetrznie elementy, ktore sa opakowane w obiekty wskazujace na element poprzedni i nastepny <- ->
        //2) Dane w pamieci sa rozstrzelone, w przeciwieństwie do Arraylisty, które dane są zapisywane "obok" siebie
        //3) Operacja wyjecia jest wolniejsza niz na ArrayLiscie, ale usuniecie jest szybsze

        /*
         * W Javie klasa LinkedList jest zaimplementowana jako lista podwójnie wiązana,
         * tzn., że każdy jej element przechowuje referencję do elementu poprzedzającego,
         * do swojego następnika oraz przechowywaną wartość (referencję na obiekt).
         * Jeżeli mamy więc listę przechowującą 100 obiektów, to aby pobrać obiekt zapisany na 49 miejscu,
         * musimy przejść po elementach 0>1>2>3>...>49, a w przypadku, gdy obiekt jest bliżej końca,
         * konieczne jest przejście ścieżki odwrotnej, np. 99>98>97>...>65.
         * Z tego powodu operacje wyszukiwania, czy też generalnie odczytu danych z środka listy wiązanej nie są zbyt efektywne.
         * Szybciej niż w przypadku ArrayListy działa natomiast wstawianie i usuwanie elementów z listy,
         * ponieważ nie ma tutaj konieczności przesuwania całego zbioru danych -
         * wystarczy zaktualizować następniki i poprzedniki odpowiednich elementów (dwie referencje).
         */

        List<String> xxx = new LinkedList<>();

        //	1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add, wyswietl cala liste petla for each.

//   TAK NIE TWORZYMY LIST     ArrayList<Integer> objects = new ArrayList<>();
        List<Integer> listaIntow = new ArrayList<>();

        listaIntow.add(13);
        listaIntow.add(2);
        listaIntow.add(55);
        listaIntow.add(12);
        listaIntow.add(93);

        for (int x : listaIntow) {
            System.out.println(x);
        }

        //	2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania

        System.out.println(zad2(listaIntow));

        //	3) Stworz metode ktora zwroci liste elementow wiekszych od 3

        System.out.println(zad3(listaIntow));


        //	4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek Krzys Grzes Tomek metoda addAll,
        //	nastepnie usun wszystkich Tomkow z tej listy

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("tomek", "ania", "tomek", "krzys", "ania", "grzes", "karolina", "basia"));

//        names.removeAll(List.of("Tomek"));
        System.out.println(names);
        //Arrays.asList() == List.of()
        //Collections.sort()

        //	5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie

        System.out.println(zad5(names));


        //	6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w kolekcji

        System.out.println(zad6(names, "Krzys"));

        //	7) Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej

        List<Double> doublex = new ArrayList<>();

        doublex.addAll(Arrays.asList(646.0, 3.0, 23.1, 13.0, 15.4, 96.5));
        Collections.sort(doublex);
        System.out.println(doublex);


        // Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca liste intow ktore sa wieksze niz podany jako parametr int
        // Wyswietl wszystkie imiona męskie które znajduja sie w liscie
        // Wyswietl ile razy było podane imie podane jako parametr


        System.out.println(aka(listaIntow,4)) ;


        // Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
        // liste zawierajaca wszystkie
        // Stringi ktore zawieraja podana znak
        // Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
        // zawierac Ania Kasia Magda

        System.out.println(abw(names, 'a'));


        // Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
        // elementów ktore sa na obu listach

        System.out.println(aa(names,imiona));



        // Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
        // najmniejszym elementem

        System.out.println(x(doublex));


        // Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow
        // wszystkich elementow na liscie, ktore sa takie same jak parametr metody
        // np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
        // output: to 0,2,5

        System.out.println(axadirect(names, "Ania"));


        // Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
        System.out.println(listaIntow);
        System.out.println(reversedOrder(listaIntow));

        // Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
        // metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic


        // Napisz metoda ktora sortuje kolekcje malejaco
        // bubble sort

//        System.out.println(listaIntow);
//        System.out.println(x(listaIntow));


        // majac liste intow zwróć liste intów tych ktore koncza sie na cyfre
        // podaną jako parametr

        System.out.println(k(listaIntow, 2));


        // Wyświetl ile razy ktorekolwiek imie zostało powtórzone Np dla imion ania piotr ania tomek krzys tomek ania program
        // powinien wypisac 3, bo byly 3 potworki

        System.out.println(repetition(names, "Tomek"));


        // Wyswietl ile razy we wszystkich imionach była użyta samogłoska
        //char[] samogloski = { 'a', 'e', 'i', 'o', 'u', 'y', 'ą', 'ę', 'ó' };

        System.out.println(howManyVowels(names));


        //Napisz metodę która wyswietli unikalne imiona
        //[Tomek, Tomek, Ania, Ania] ---> Tomek, Ania

        //        PYTANIE :
        // co w przypadku imion Janek, Tomek, Tomek, Ania, Ania, Tomek, Rafał

        List<String> k = Arrays.asList("Tomek", "Tomek", "Ania", "Ania");
        System.out.println(unique(k));

        //Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci

        System.out.println(above5Charandeven(names));


        //Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie listy)
        //Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada liczbom na 2 liscie
        // Ania Krzys Tomek Kasia Jan
        // 4 2 5 8 3
        //Ania Tomek Jan

        List<String> ala = new ArrayList<>();
        ala.addAll(Arrays.asList("Ala", "Marcin", "Jan", "Maciej", "Karol", "Sebastian"));

        List<Integer> ala1 = new ArrayList<>();
        ala1.addAll(Arrays.asList(3, 6, 6, 5, 3));

        System.out.println(axac(ala, ala1));


        // Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
        // sume dlugosci wszystkich Stringów


    }

    public static int zad2(List<Integer> list) {
        int sum = 0;

        for (int x : list)
            sum += x;
        return sum;
    }

    public static List<Integer> zad3(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int x : list)
            if (x > 3)
                result.add(x);
        return result;
    }

    public static String zad5(List<String> x) {
        String k = "";
        for (String b : x)
            if (b.length() > k.length())
                k = b;
        return k;
    }

    public static boolean zad6(List<String> x, String p) {
        int o = 0;
        for (String v : x)
            if (v.equals(p))
                o++;
        return o > 0;
    }

//    public static List<Integer> x(List<Integer> k) {
//        int lesser;
//        for (int j = 0; j < k.size(); j++) {
//            for (int z = j + 1; z < k.size(); z++) {
//                if (k.get(j) > k.get(z)) {
//                    lesser = k.get(j);
//                    k.set(z,(k.get(j)));
//                    k.set(j, lesser);
//                }
//            }
//        }return k;
//    }

    public static List<Integer> k(List<Integer> listx, int x) {
        List<Integer> result = new ArrayList<>();

        for (Integer b : listx)
            if (b % 10 == x)
                result.add(b);
        return result;
    }


    public static int repetition(List<String> x, String imie) {
        int p = 0;

        for (String a : x)
            if (a.equals(imie))
                p++;
        return p;
    }

    public static int howManyVowels(List<String> x) {
        int a = 0;
        char[] samogloski = {'a', 'e', 'i', 'o', 'u', 'y', 'ą', 'ę', 'ó'};

        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < x.get(i).length(); j++) {
                for (int k = 0; k < samogloski.length; k++) {
                    if (x.get(i).charAt(j) == samogloski[k] || x.get(i).charAt(j) == Character.toUpperCase(samogloski[k]))
                        a++;
                }
            }
        }
        return a;
    }

    public static List<String> unique(List<String> x) {
        List<String> ala = new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {
            for (int j = i + 1; j < x.size(); j++) {
                if (x.get(i).equals(x.get(j))) {
                    ala.add(x.get(i));
                }
            }
        }
        return ala;
    }


    public static Double x(List<Double> k) {
        Collections.sort(k);

        Double a, b;
        a = k.get(k.size() - 1);
        b = k.get(0);
        Double x = (a - b);

        return x;
    }

    public static List<String> above5Charandeven(List<String> list) {
        List<String> listx = new ArrayList<>();
        for (String x : list) {
            if (x.length() > 5 && (x.length() % 2 == 0)) {
                listx.add(x);
            }
        }
        return listx;
    }

    public static List<Integer> aka (List<Integer> intlist, int x){
        List<Integer> listx = new ArrayList<>();

        for (Integer b : intlist)
            if (b > x) {
                listx.add(b);
            }
        return listx;
    }

    public static List<String> aa(List<String> string1, List<String> string2) {
        List<String> listx = new ArrayList<>();

        for (int i = 0; i < string1.size(); i++) {
            for (int j = 0; j < string2.size(); j++) {
                if (string1.get(i).equals(string2.get(j))) {
                    listx.add(string1.get(i));
                }
            }
        }
        return listx;
    }

    public static List<String> axac(List<String> string1, List<Integer> integers1) {
        List<String> listString = new ArrayList<>();

        if (string1.size() == integers1.size()) {
            for (int i = 0; i < string1.size(); i++) {
                if (string1.get(i).length() == integers1.get(i))
                    listString.add(string1.get(i));
            }
        }
        return listString;
    }

    public static List<Integer> reversedOrder(List<Integer> x) {
        List<Integer> ro = new ArrayList<>();

        for (int i = x.size() - 1; i >= 0; i--) {
            ro.add(x.get(i));
        }
        return ro;
    }

    public static List<Integer> axadirect(List<String> x, String k) {
        List<Integer> ax = new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).equals(k))
                ax.add(i);
        }
        return ax;
    }

    public static List<String> abw(List<String> x, char l) {
        List<String> ax = new ArrayList<>();

        for (String b : x)
            if (b.indexOf(l) != -1)
                ax.add(b);

        return ax;
    }


}