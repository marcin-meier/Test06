package Iteracja03.kolekcje.mapy;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        //KLUCZ - WARTOSC
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Jeden");
        hashMap.put(2, "Dwa");
        hashMap.put(7, "Siedem");
        hashMap.put(3, "Trzy");
        hashMap.put(5, "Pięć");
        hashMap.put(0, "Zero");
        hashMap.put(null, "null");
        hashMap.put(6, "sześć");

        System.out.println(hashMap.get(1));
        System.out.println(hashMap);

        System.out.println(hashMap.values());
        System.out.println("ELO");


        System.out.println(hashMap.size());

//        for (int i = 0; i < hashMap.size(); i++) {
//            System.out.println(hashMap.get(i));
//        }

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("Jeden"));

//        hashMap.clear();
        hashMap.put(3, "Trojeczka");
        System.out.println(hashMap);

        System.out.println("entry set");
        System.out.println(hashMap.entrySet());

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Stworz mape gdzie kluczem jest String i wartoscia tez String, wyswietl cala mape za pomoca Entry

        Map<String, String> map123 = new HashMap<>();

        map123.put("kobieta mloda", "Ala");
        map123.put("kobieta mloda", "Alsadasdasda");
        map123.put("kobieta stara", "Ola");
        map123.put("kobieta bardzo stara", "Bozena");

        for (Map.Entry<String, String> entry : map123.entrySet())
            System.out.println(entry.getValue());


        // Dodaj do mapy 4 slowa jako klucze, niech wartoscia bedzie dlugosc kazdego ze slow
        //zad2(text, Map<String, Integer>)
        //zad2(Figura) ---> Figura = 3
        //zad2(ala123) --> ala123 = 6

        // Napisz metoda która dodaje słowa do mapy. Kluczem maja byc kolejne liczby
        // naturalne zaczynajac od 0
        //dodaj(Map, slowo)
        //-> dodaj(Figura) -> 0 - Figura
        //-> dodaj(ala1) -> 1 - ala1
        //-> dodaj(ala2) -> 2 - ala2
        System.out.println("witam");
        Map<Integer, String> map = new HashMap<>();


        Map<String, Integer> map12345 = new HashMap<>();

        zad2("Marcin", map12345);
        zad2("Jola", map12345);
        zad2("Karolina", map12345);
        System.out.println(map12345);

        // Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
        // wyswietlic ile razy jaki element byl dodany
        //zad3(Figura)
        //zad3(Figura)
        //zad3(Figura)
        //zad3(janek)
        //zad3(janek)
        //---> Figura = 3
        //---> janek = 2
        Map<String, Integer> map333 = new HashMap<>();
        zad3("Figura", map333);
        zad3("Figura", map333);
        zad3("Figura", map333);
        zad3("ala2", map333);
        zad3("Ala2", map333);
        zad3("ala3", map333);
        zad3("ala3", map333);
        zad3("ala3", map333);
        System.out.println(map333);

        String ala = "Figura";
//        System.out.println(String.valueOf()

        //zad4
        // napisz metode ktora przyjmuje Mape<Integer, String>,
        // zamien wartosci, gdzie klucze są parzyste
        // na słowo "parzyste"

        zad4(map);
        System.out.println(map);

        List<String> klasa1a = new ArrayList<>();
        klasa1a.addAll(Arrays.asList("Bartek", "Marcin", "Andrzej", "Michał", "Paweł"));

        List<String> klasa2a = new ArrayList<>();
        klasa2a.addAll(Arrays.asList("Bartek", "Juliusz", "Sebastianowiec", "Michał", "Paweł", "Paweł", "Paweł"));


        Map<String, List<String>> mapaklas = new HashMap<>();

        mapaklas.put("klasa1a", klasa1a);
        mapaklas.put("klasa2a", klasa2a);

        System.out.println(zad5a(mapaklas));
        System.out.println(zad5b(mapaklas));

        System.out.println(mapa(klasa2a));
        System.out.println(mapaSI(klasa2a));

        System.out.println(mapay(klasa2a));


        //TODO:
        // Napisz program, ktory symuluje dzialanie slownika
        // polsko-angielskiego. Przykładowy program: Podaj slowko po Polsku: mama Slowko
        // po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
        // (cancel)

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("mama", "mother");
        dictionary.put("tata", "father");
        dictionary.put("syn", "son");
        dictionary.put("córka", "daughter");
        dictionary.put("wujek", "uncle");
        dictionary.put("ciocia", "aunt");
        dictionary.put("pies", "dog");
        dictionary.put("kot", "cat");

        System.out.println(dictionary.get(ala));

        Scanner typeInWord = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj słówko po polsku");
            String wordPL = typeInWord.nextLine();
            if (wordPL.equals("cancel")) {
                System.out.println("Wyjście ze słownika");
                break;
            }
            String wordEN = dictionary.get(wordPL);
            Objects.isNull(wordEN);
            if (wordEN == null) // zapytać o to dlaczego nie wordEN.equals(null)
                System.out.println("Brak wyrazu w słowniku");
            else
                System.out.println("ENG : " + wordEN);
        }


        // W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
        // (same nazwiska jako Stringi) które uczeszczaja do klasy.
        // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej
        // klasy
        // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas

        //Napisz metode, ktora jako argument przyjmuje liste Stringow i ma zwrocic mape<String,String>
        //gdzie kluczem jest pierwszy znak w danym słowie, a wartością ostatni znak w tym samym słowie
        //(["code", "bug"]) → {"b": "g", "c": "e"}
        //(["man", "moon", "main"]) → {"m": "n"}
        //(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

        //Napisz metode, ktora jako argument przyjmuje tablice Stringow i ma zwrocic mape<String, Integer>
        //gdzie kluczem jest podany String, a wartością jego długość
        //(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        //(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        //(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}

        //Napisz metode, ktora jako argument przyjmuje tablice Stringow i ma zwrocic mape<String, Boolean>
        //gdzie kluczem jest podany String, a wartosc przyjmuje true, jesli podany String występuje conajmniej 2 razy
        //(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //(["c", "c", "c", "c"]) → {"c": true}

        //Napisz metode, ktora jako argument przyjmuje tablice Stringow i ma zwrocic Stringa,
        //który będzie zawierał tylko te znaki, które zostały powtórzone 2, 4, 6... razy
        //Zwroc pustego Stringa jezeli zaden znak nie wystepuje przynajmniej 2 razy
        //(["a", "b", "a"]) → "a"
        //(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
        //(["a", "", "a"]) → "a"

        List<String> k1 = new ArrayList<>(Arrays.asList("a", "c", "a", "a", "b", "c", "a"));
        System.out.println(k1);
        System.out.println(s(k1));


    }

    public static void map(String text, Map<Integer, String> map) {

        if (map.isEmpty())
            map.put(0, text);
        else {
            int temp = 0;
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                temp = entry.getKey();
            }
            map.put(temp + 1, text);
        }
    }


    public static void zad2(String text, Map<String, Integer> map) {
        map.put(text, text.length());
    }


    public static void zad3(String text, Map<String, Integer> map1) {
        if (!map1.containsKey(text)) {
            map1.put(text, 1);
        } else {
            map1.put(text, map1.get(text) + 1);
        }
    }

    public static void zad4(Map<Integer, String> aaa) {
        for (Map.Entry<Integer, String> aaa123 : aaa.entrySet()) {
            if (aaa123.getKey() % 2 == 0)
                aaa123.setValue("parzyste");
        }
    }

    //metoda pomocnicza do znajdywania najdluzszego stringa
    public static String findMaxName(List<String> list) {
        String max = list.get(0);
        for (String name : list) {
            if (name.length() > max.length()) {
                max = name;
            }
        }
        return max;
    }

    //SOLID
    //metoda 1)
    public static List<String> maxNamesFromEachClass(Map<String, List<String>> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(findMaxName(entry.getValue()));
        }
        return result;
    }

    //metoda 2)
    public static String maxNameFromSchool(Map<String, List<String>> map) {
        return findMaxName(maxNamesFromEachClass(map));
    }

    public static List<String> zad5a(Map<String, List<String>> map1) {
        List<String> longestNames = new ArrayList<>();

        for (Map.Entry<String, List<String>> x : map1.entrySet()) {
            String a1 = "";
            for (String b : map1.get(x.getKey())) {
                if (b.length() > a1.length())
                    a1 = b;
            }
            longestNames.add(a1);
        }
        return longestNames;
    }

    public static String zad5b(Map<String, List<String>> map) {
        String k = "";

        for (Map.Entry<String, List<String>> x : map.entrySet()) {
            for (String a : map.get(x.getKey())) {
                if (a.length() > k.length()) {
                    k = a;
                }
            }
        }
        return k;
    }

    public static Map<String, String> mapa(List<String> text) {
        Map<String, String> mapa = new HashMap<>();
        for (String k : text)
            mapa.put(String.valueOf(k.charAt(0)), String.valueOf(k.charAt(k.length() - 1)));

        return mapa;
    }

    public static Map<String, Integer> mapaSI(List<String> text) {
        Map<String, Integer> mapa = new HashMap<>();
        for (String k : text)
            mapa.put(k, k.length());
        return mapa;
    }

    //Napisz metode, ktora jako argument przyjmuje tablice Stringow i ma zwrocic mape<String, Boolean>
    //gdzie kluczem jest podany String, a wartosc przyjmuje true, jesli podany String występuje conajmniej 2 razy
    //(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    //(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    //(["c", "c", "c", "c"]) → {"c": true}

    public static Map<String, Boolean> mapay(List<String> lista) {
        Map<String, Integer> mapa = new HashMap<>();
        Map<String, Boolean> mapa1 = new HashMap<>();

        int conajmniejIleTychSamych = 3;

        for (String k : lista) {
            if (mapa.containsKey(k)) {
                mapa.put(k, mapa.get(k) + 1);
            } else {
                mapa.put(k, 1);
            }
            mapa1.put(k, mapa.get(k) >= conajmniejIleTychSamych);
        }
        return mapa1;
    }
    //Napisz metode, ktora jako argument przyjmuje tablice Stringow i ma zwrocic Stringa,
    //który będzie zawierał tylko te znaki, które zostały powtórzone 2, 4, 6... razy
    //Zwroc pustego Stringa jezeli zaden znak nie wystepuje przynajmniej 2 razy
    //(["a", "b", "a"]) → "a"
    //(["a", "b", "a", "c", "a", "d", "a"]) → "a"
    //(["a", "", "a"]) → "a"

    public static String s(List<String> list) {
        String s = "";
        Map<String, Integer> mapa = new HashMap<>();
        for (String w : list) {
            if (mapa.containsKey(w))
                mapa.put(w, mapa.get(w) + 1);
            else
                mapa.put(w, 1);
        }
        for (Map.Entry<String, Integer> map1 : mapa.entrySet())
            if (map1.getValue() % 2 == 0)
                s += (map1.getKey() + " ");
        return s;
    }
}



