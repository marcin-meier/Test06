package Iteracja01.zmienne;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        //sout + tab
        System.out.println(50);
        System.out.println("test1");
        System.out.print("test21");
        System.out.println("Hello!\nMy name is Michal");
        System.out.println("Hello!\nMy name is Michal");
        System.out.println("Hello!\nMy name is \"Michal\"");

        /*
        block comment


         */

        //camelCase
        //int - liczba calkowita (zakres: -2’147’483’648 do 2’147’483’647)
        int myFirstVar = 10;
        System.out.println(myFirstVar);
        myFirstVar = 20;
        System.out.println(myFirstVar);

        //short - liczba calkowita (zakres -32’768 do 32’767)
        short myShortVar = 10;

        //long - liczba całkowita (zakres -9’223’372’036’854’775’808 do 9’223’372’036’854’775’807)

        //double - liczba rzeczywista -  8 bajtów, podwójna precyzja - ok 16 cyfr znaczących po przecinku.
        double myDoubleVar = 3.14;
        System.out.println(myDoubleVar);
        //float - liczba rzeczywsita, mniej miejsca niż double - 4 bajty pamięci, pojedyncza precyzja - ok 8 cyfr znaczących po przecinku,

        boolean myBoolVar = true;
        System.out.println(myBoolVar);

        char myCharVar = 'A';
        System.out.println(myCharVar);
        myCharVar = 65;
        System.out.println(myCharVar);
        //https://www.asciitable.com/

        //byte -128 -> 127

        String tekst = "Test1";
        System.out.println(tekst);
        tekst = "xxxx";
        System.out.println(tekst);


        int a = 5, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        //CTRL + ALT + L
        System.out.println("Suma " + a + " i " + b + " wynosi " + (a + b));

        int c = 10, d = 5;
        String txt = "Tekst";
        System.out.println(c + txt);

        System.out.println(c + d + txt); //15Tekst
        System.out.println(txt + c + d); //Tekst105
        System.out.println(txt + (c + d)); //Tekst15

        //---Stwórz prosty kalkulator. Zadeklaruj dwie zmienne typu double i wykonaj na nich różne działania matematyczne.
        //---double x=4, y=5;
        //---Wynik na konsoli: Suma 4 i 5 wynosi 9
        //---Wynik na konsoli: Różnica 4 i 5 wynosi -1

        double x = 4, y = 5;
        System.out.println("Suma " + x + " i " + y + " wynosi " + (x + y));
        System.out.println("Różnica " + x + " i " + y + " wynosi " + (x - y));

        double suma = x + y;
        System.out.println(suma);

        String x1 = "ABC";
        String x2 = "XYZ";
        String x3 = x1 + x2;
        System.out.println(x3);

        System.out.println(Math.PI);
        System.out.println(Math.pow(x, y));
        System.out.println(Math.max(5, 10));

        int i = 5;
        System.out.println(i);

        i = i + 2;
        System.out.println(i);

        i += 2;
        System.out.println(i);

        i++;
        System.out.println(i);

        i--;
        System.out.println(i);

        //TODO:
        //---Stwórz zmienne imie, nazwisko, adres, wiek i wypisz te informacje tak, aby każda z nich była w nowej linijce;
        String imie = "Marcin";
        String nazwisko = "Meier";
        String adres = "Koło";
        int wiek = 22;
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(adres);
        System.out.println(wiek);
        //---Stwórz dwie zmienne typu double i w jednej linii wypisz ich sume, różnice, iloczyn i iloraz.
        double w = 3, z = 5;
        System.out.print(w + z + "  ");
        System.out.print(w - z + "  ");
        System.out.print(w * z + "  ");
        System.out.println(w / z + "  ");

        //---Stwórz zmienną typu String i wyświetl jej długość (wykorzystaj metodę length() --> wygoogluj ;))
        String chodnik = "abecadłoo";
        System.out.println(chodnik.length());

        //---Stwórz Kwadrat 5x5 złożony z gwiazdek '*' i wyświetl go na konsoli.
        int bok = 5;

        for (int t = 0; t < bok; t++) {
            for (int j = 0; j < bok; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }

        //---Spróbuj zainicjalizować inta wartością double i na odwrót. Spróbuj wyświetlić to na konsoli. Jaki jest efekt takiego zabiegu?
        //---Przykład: int var1 = 3.14          double var2 = 1
        int co = 3;
        double kt = 1;
        System.out.println(co);
        System.out.println(kt);


        //---Stwórz 2 zmienne typu double: wysokosc i szerokosc.
        //---Zainicjalizuj je przykładowymi danymi i oblicz pole i obwód tej figury.
        //---Wszystkie obla zrób wiczeni nowych zmiennych o nazwie: pole i obwod.

        double h = 4, v = 6;
        double pole = h * v;
        double obwod = 2 * (h + v);

        System.out.println("Pole wynosi " + pole);
        System.out.println("Obwód wynosi " + obwod);

        //---Wyświetl wszystko ładnie na konsoli :)


// Formatowanie danych np. 3333,33333333 zapisane jako 3 333,33

        System.out.printf("%,(.1f", 10000.0 / 3.0);
        System.out.println();

        int a1 = 1;
        int b2 = 1;

        double aw = 16;
        double aw1 = 15;
        double x12;
        double x13;
        x12 = (Math.sqrt(aw));
        x13 = (Math.sqrt(aw1));
//        double x13 = x12 * x12;
        System.out.println();
        System.out.println((x13));



    }
}
