//package iteracja03.obiektowka;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
        //KLASA - definicja zestawu cech i funkcjonalnosci danego elementu

        //OBIEKT - konkretna reprezetnacja klasy (konkertny egzamplarz/instancja)
//        Samochod toyota = new Samochod();
//        toyota.model = "AURIS";
//        toyota.marka = "TOYOTA";
////        toyota.iloscDrzwi = 5;
//        toyota.kolor = "CZARNY";
//
//
//        System.out.println(
//                toyota.marka + " " + toyota.model
//                        + "\nKolor " + toyota.kolor
////                        + "\nIlosc drzwi " + toyota.iloscDrzwi
//        );
//
//        System.out.println();
//
//        Samochod toyota2 = new Samochod();
//        toyota2.kolor = "CZERWONY";
//        System.out.println(
//                toyota2.marka + " " + toyota2.model
//                        + "\nKolor " + toyota2.kolor
//                        + "\nIlosc drzwi " + toyota2.iloscDrzwi
//        );
//
//        System.out.println();
//
//        System.out.println(
//                toyota.marka + " " + toyota.model
//                        + "\nKolor " + toyota.kolor
//                        + "\nIlosc drzwi " + toyota.iloscDrzwi
//        );
//
//        System.out.println();
//        Samochod merecedes = new Samochod();
//        // mercedes to referencja typu Samochod, ktora wskazuje na obiekt typu Samochod.
//        //wartosc domyslna dla char = '\u0000'
//        merecedes.printInfo();
//
//        String x = "XDDDDD";
//
////        Samochod s1 = null;
////        String s2 = "X";
////        System.out.println(s2.marka);
////        System.out.println(s1.marka);
//
//        /*
//         * Zadanie 1:
//         * Napisz program, w którym utworzysz dwie klasy:
//         * Student - klasa, która przedstawia studenta. Zawiera podstawowe informacje o danej osobie
//         * Main - klasa, w której utworzysz 3 obiekty reprezentujące studentów, a następnie wyświetlisz informację o nich na konsoli.
//         */
//
//        Student student1 = new Student();
//        student1.imie = "Marcin";
//        student1.nazwisko = "Kowalski";
//        student1.wiek = 20;
//
//        Student student2 = new Student();
//        student2.imie = "Marcin";
//        student2.nazwisko = "Meier";
//        student2.wiek = 22;
//
//        student1.printInfo();
//        student2.printInfo();
//
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//
//        System.out.println(students);
//
//        for (Student s : students) {
//            s.printInfo();
//        }
//
//        Student s3 = new Student("Jan", "Kowalski", 30);
//        s3.printInfo();
//
//        Student s4 = new Student("Jan");
//        s4.printInfo();
//
//        // przeciążanie metod (method overloading)
//        NumberPrinter np = new NumberPrinter();
//        np.printNumber(3, 2, 5);
//        np.printNumber(3, 2);
//        np.printNumber(3);
//
//        /*
//        * Zadanie 1:
//        Napisz klasę Kalkulator, w którym zdefiniujesz metody dodaj() i odejmij() w kilku przeciążonych wersjach
//        aby mogły dodawać lub odejmować 2 lub 3 liczby.
//        Pokaż działanie kodu.
//        */
//
//        Kalkulator calculator = new Kalkulator();
//
//        calculator.dodaj(4,5);
//        calculator.dodaj(5,4,2);
//        calculator.odejmij(5,2);
//        calculator.odejmij(9,4,2);
//
//        Student student = new Student();
//        student.imie = "Marcin";
//        student.nazwisko = "Meier";
//        student.wiek = 17;
//
//        student.printInfo();
//
//        Student student69 = new Student("Marcin");
//
//    }
//}
