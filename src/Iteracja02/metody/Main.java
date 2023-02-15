package Iteracja02.metody;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //marcinmeier123@gmail.com

        //Specyfikator dostępu
        //public - dostęp do danej klasy lub składowej klasy ma każda inna klasa.
        //private - dostęp ma tylko ta sama klasa w ktorej ją stworzyliśmy
        //protected - tylko ten sam pakiet (package)

//        String s = zwrocTekst();
//        System.out.println(s);
//
//        System.out.println(zwrocTekst());
//
//        int x = 10;
//        System.out.println(dodaj5(10));
//
//        System.out.println(suma3Liczb(1, 2, 3));
//
//        System.out.println(scalTekst("Michal"));
//
//        System.out.println(zad1("Hej"));
//
//        System.out.println(zad2(2.0, 4.5));
//
//        System.out.println(zad3("ala"));
//
//        System.out.println(zad4("ala456456465", "kotek"));
//
//        System.out.println(zad5(5.6, 3.5));
//        System.out.println(zad8(3, 2));
//
        int[] tabIntow = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(zad9(tabIntow));
//
//        int[] wiekszeOd5 = zad10(tabIntow);
//
//        System.out.println(Arrays.toString(zad10(tabIntow)));
//
        zad11(tabIntow);

        System.out.println(pd1("bb"));

        System.out.println(pd2("aleks!!!!??", '?'));

        System.out.println(pd3(6));

        System.out.println(pd4(91));

        System.out.println(pd5(123));

        System.out.println(1 % 10);

        String a = "ala";

        System.out.println(a.toCharArray());

        System.out.println(pd6("kot"));

//        System.out.println(pd8(16));

        System.out.println((float) 1 / 4);
//        System.out.println(Math.pow(2,0));

        pd81(16);

        System.out.println();

        String ale1 = "Ara";
        System.out.println(ale1.charAt(1));
        System.out.println(ale1.toCharArray());


        String[] aka1 = {"Ala", "Bartek", "Konrad", "Hubi", "Sebastian", "Marzena"};

        System.out.println(abc123(aka1));
        System.out.println(string123(aka1));

        double[] dxb = {1.23, 4.1, 6.145, 90.12};

        System.out.println(aDouble(dxb));

        int[] ddd = {9, 2, -4, 6, 10};

        System.out.println(even(ddd));

        System.out.println(array1or4(ddd));

        System.out.println(2342 % 10);

        System.out.println(sameDigit(ddd));

        System.out.println(Arrays.toString(Array1234(6)));

        ala(aka1, 'a');
        System.out.println();

        System.out.println(sqrt(82));

//        System.out.println(yesOrNo(82));
//
//        System.out.println(Arrays.toString(Array_mo123(ddd)));
//
//        System.out.println(Arrays.toString(Array_mo1234(ddd)));
//
//        System.out.println(index("baderwrwe"));

    }

    public static void wyswietlNapis() {
        for (int i = 0; i < 3; i++) {
            System.out.println("HELLO");
        }
    }

    public static String zwrocTekst() {
        String tekst = "bla bla";
        return tekst;
    }

    public static int dodaj5(int a) {
        int b = a + 5;
        return b;
    }

    public static int suma3Liczb(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }

    public static String scalTekst(String tekst) {
        String result = tekst + " ma kota";
        return result;
    }

    // Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien dobry"

    public static String zad1(String s) {
        return s + " dzień dobry";
    }

    // Stworz metode ktora liczy sume dwoch liczb (double) ktore sa podane jako parametr
    public static double zad2(double x, double y) {
        return x + y;
    }

    // Stwórz metode ktora zwraca dlugosc Stringa podanego jako parametr
    public static int zad3(String text) {
        return text.length();
    }

    // Stworz metode ktora zwraca dluzszy z dwoch podanych jako parametr Stringow

    public static String zad4(String text1, String text2) {
//        if (text2.length() > text1.length())
//            return text2;
//
//        return text1;

        //powyzszy kod tez mozna zapisac w 1 linii
        //OPERATOR TERNARNY ternary operator ENG
        //(warunek logiczny) ? co jesli true : co jesli false
        return text2.length() > text1.length() ? text2 : text1;
    }

    // Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako parametr
    // Gdy liczby są równe zwracamy 0

    public static double zad5(double x, double y) {
//        if (x > y)
//            return x;
//        else if (x == y)
//            return 0;
//        return y;

        return (x > y) ? x : (x == y) ? 0 : y;
    }

    // Napisz metode ktora jako argument (parametr) przyjmuje
    // 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia

    public static int zad6(int a, int b, int c) {
        return (a + b) * c;
    }

    // Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta
    public static boolean zad7(int a) {
        return a % 2 == 0;


        //NIGDY W ZYCIU CZEGOS TAKIEGO NIE PISZ!!!!! :(((
//        if (a % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    // Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19]
    // to zwrocona wartosc to zawsze 19

    public static int zad8(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
            return 19;
        return a + b;

//        return ((a >= 13 && a<= 19) || (b >= 13 && b <= 19)) ? 19 : a+b
    }

    //---Napisz metode, ktora za swoj parametr przyjmuje tablice intów,
    //---następnie zwraca sumę tych liczb

    public static int zad9(int[] tab) {
        int sum = 0;
//        for (int i = 0; i < tab.length; i++) {
//            sum += tab[i];
//        }
        //1 2 3 4 5
        for (int liczba : tab) {
            sum += liczba;
        }
        return sum;
    }

    //---Napisz metode, ktora za swoj parametr przyjmuje tablice intów, a nastepnie
    //---zwraca tablice liczb większych od 5

    public static int[] zad10(int[] tab1) {
        //1 3 5 6 7
        //6 7
        int counter = 0;
        for (int p : tab1) {
            if (p > 5)
                counter++;
        }
        int[] tab2 = new int[counter];
        //tab2[0] = tab1[3]
        //tab2[1] = tab1[4]
        int i = 0;
        for (int j = 0; j < tab1.length; j++) {
            int p = tab1[j];
            if (p > 5) {
                tab2[i] = p;
                i++;
            }
        }
        return tab2;
    }

    //---Napisz metode, ktora za swoj parametr przyjmuje tablice intow, a nastepnie
    //---wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7

    public static void zad11(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0 && tab[i] > 7)
                System.out.print(tab[i] + " ");
        }
        System.out.println();
    }


    //TODO:
    //Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
    // jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
    // metoda startsWith() i endsWith() <- sprawdzenie czy string konczy/zaczyna sie na dany literał łancuchowy
    // zddy -> zzyy
    // zasd -> zzz
    // asdy -> yyy
    // pusty string -> pusty string
    // z -> zzz
    // y -> yyy
    // zy -> zzyy
    // a -> a
    // bb -> bb

    public static String pd1(String text1) {
        if (text1.startsWith("z") && text1.endsWith("y"))
            return "zzyy";
        else if (text1.startsWith("z"))
            return "zzz";
        else if (text1.endsWith("y"))
            return "yyy";
        return text1;
    }


// Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.

    public static int pd2(String text1, char znak) {
        int x = 0;
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == znak)
                x++;
        }
        return x;
    }


//Napisz metodę obliczająca silnię z podanej liczby

    public static int pd3(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }

//9! =9*8*7*6*5*...*1
//        5! =120=5*4*3*2*1


// napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
// jednosci od cyfry dziesiatek

    public static boolean pd4(int a) {
        return (a / 10 < a % 10);
    }


// Napisz funkcję, która wyznacza sumę cyfr podanej liczby całkowitej.

    public static int pd5(int a) {
        int sum = 0;
        int x = a;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

// Napisz metode która liczy długosc Stringa, nie uzywac metody lenght()


    public static int pd6(String text1) {
        int sum = 0;
        for (char i : text1.toCharArray()) {
            sum++;
        }
        return sum;
    }

// Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
// dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
// uwzglednic ze a^0 = 1
// uwzglednic ze a^-b = 1/(a^b)

    public static double pd7(double a, double b) {
        double c = a;

        for (int i = 0; i < Math.abs(b); i++) {
            c *= a;
        }
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1 / c;
        }

        return c;
    }


// Napisz funkcje, ktora stwierdza, czy zadana jako parametr liczba calkowita
// jest kwadratem pewnej liczby calkowitej. Liczby bedace kwadratami liczb calkowitych to 1, 4,
// 9, 16 itd.

    public static boolean yesOrNo(int x) {
        return Math.sqrt(x) == (int) (Math.sqrt(x));
    }

// Wartosci funkcji ma byc prawda, jesli liczba spelnia warunek oraz falsz w
// przeciwnym wypadku. Math.sqrt(x) zwraca pierwiastek z x
// sqrt(16)(SQUARE ROOT) = 4 czyli ok bo liczba całkowita
// sqrt(17) - 4.2 czyli nie ok bo liczba niecałkowita :)

    public static boolean sqrt(double k) {
        return (int) Math.sqrt(k) * Math.sqrt(k) - k == 0;
    }

// Wypisz dzielniki liczby naturalnej podanej jako parametr
// np dla 16 wynik to 1,2,4,8,16

    public static void pd81(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                System.out.print((i) + " ");
        }
    }

//Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
//xbadxxx - true
//badxxx - true
//xxbadxx - false;

    public static boolean index(String ovo) {
        String k = "bad";
        int check = 0;
        for (int i = 0; i < k.length(); i++) {
            if (ovo.charAt(i) == k.charAt(i) || ovo.charAt(i + 1) == k.charAt(i))
                check++;
        }
        return (check == k.length());
    }

//---Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
//---zwraca sume dlugosci tych stringów

    public static int abc123(String[] stringArray) {
        int sumix = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (char c : stringArray[i].toCharArray()) {
                sumix++;
            }
        }
        return sumix;

        //rozw MM
//        for (String s : stringArray) {
//            sumix += s.length();
//        }
    }
//---Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
//---wypisuje najdluzszy ze stringow

    public static String string123(String[] x) {
        String max = x[0];
        for (int i = 0; i < x.length; i++)
            if (x[i].length() > max.length())
                max = x[i];
        return max;
    }

//---dla podanej tablicy doubli oblicz srednia jej elementów

    public static double aDouble(double[] x) {
        double sumix = 0;
        int samax = 0;

        for (int i = 0; i < x.length; i++) {
            sumix += x[i];
            samax++;
        }
        return (sumix / samax);
    }

    /*
     * Napisz metode ktora jako parametr przyjmuje tablice intow, a nastepnie zwraca
     * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
     * 3 dla liczb parzystych odejmuje od nich 1
     *
     * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrocic tablice
     * {1,6,3,8}
     */

    public static int[] arrayMo123(int[] toBe) {
        int[] array_mo123 = new int[toBe.length];

        for (int i = 0; i < toBe.length; i++) {
            if (toBe[i] % 2 == 0)
                array_mo123[i] = (toBe[i] - 1);
            else
                array_mo123[i] = (toBe[i] + 3);
        }
        return array_mo123;
    }

    /*
     * Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
     * tablice intow zmieniona w nastepujacy sposob:
     * -liczby podzielne przez 3 zamienia na -1
     * -liczby niepodzielne przez 3 podnosi do kwadratu
     * Dla tablicy = {2,3,4,5,6} wynik to {4,-1,16,25,-1}
     */

    public static int[] Array_mo1234(int[] toBe) {
        int[] Array_mo1234 = new int[toBe.length];

        for (int i = 0; i < toBe.length; i++) {
            if (toBe[i] % 3 == 0)
                Array_mo1234[i] = -1;
            else
                Array_mo1234[i] = (toBe[i] * toBe[i]);
        }
        return Array_mo1234;
    }


// napisz metode ktora przyjmuje jako parametr tablice Stringow oraz chara,
// wypisuje te slowa z tablicy ktore maja przynajmniej dwa podane chary
// Ania Tomek Magda Krzys Ania i char a
// output Ania Magda Ania

    public static void ala(String[] a, char x) {

        for (int i = 0; i < a.length; i++) {
            int y = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == x || a[i].charAt(j) == Character.toUpperCase(x))
                    y++;
            }
            if (y >= 2)
                System.out.print(a[i] + " ");
        }
    }

// Napisz metode ktora wypelnia tablice losowymi (ilosc elementow podana jako
// parametr) wartosciami z przedzialu 1-9 i
// zwraca tablice posortowana w kolejnosci rosnacej

    public static int[] Array1234(int x) {
        int[] array1234 = new int[x];
        int lesser;

        for (int i = 0; i < x; i++) {
            array1234[i] = ((int) (Math.random() * 9) + 1);
        }
        for (int i = 0; i < array1234.length; i++) {
            for (int j = i + 1; j < array1234.length; j++) {
                if (array1234[i] > array1234[j]) {
                    lesser = array1234[i];
                    array1234[i] = array1234[j];
                    array1234[j] = lesser;
                }
            }
        }
        return array1234;
    }

// napisz metode ktora obliczy ile jest elementow parzystych z tablicy

    public static int even(int[] x) {
        int evensum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0)
                evensum++;
        }
        return evensum;
    }

// napisz metode ktora zwraca true tylko wtedy gdy kazdy element z tablicy to 1 lub 4

    public static boolean array1or4(int[] x) {
        int a = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 4 || x[i] == 1)
                a++;
        }
        return a == x.length;

        //rozw MM
//        for (int liczba : x) {
//            if (liczba != 1 && liczba != 4) {
//                return false;
//            }
//        }
//        return true;
    }

// napisz metode ktora zwraca true jesli kazda liczba z tablicy podanej jako
// parametr konczy sie ta sama cyfra
//117 7 786847 37 - true
//111 1 121 101 7 - false

    public static boolean sameDigit(int[] x) {
        int c = x[0] % 10;
        int b = 0;
        for (int i = 0; i < x.length; i++) {
            if (x.length == 1)
                return false;
            if (x[i] % 10 == c)
                b++;
        }
        return b == x.length;
    }

}