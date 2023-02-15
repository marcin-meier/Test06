package Iteracja03.obiektowka.wstep;

import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) {

        Pracownik employee1 = new Pracownik("Andrzej", "Bednarkiewicz", 92021208339L, 4500);
        Pracownik employee2 = new Pracownik("Maurycy", "Gustaw", 10100402334L, 7400);
        Pracownik employee3 = new Pracownik("Henryk", "Gustaw", 78051090433L, 11000);
        Pracownik employee4 = new Pracownik("Krystyna", "Lubaszenko", 78051190423L, 12200);
        Pracownik employee5 = new Pracownik("Antonina", "Forte", 92111190223L, 10210);

        List<Pracownik> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);
        listOfEmployees.add(employee5);

        //Zwracają wyciągnąć rok urodzenia danego pracownika z peselu
        for (Pracownik alx : listOfEmployees)
            System.out.println(alx.whatYearOfBirth());
        System.out.println();
        // Zwracają wyciągnąć miesiac urodzenia danego pracownika z peselu
        for (Pracownik alx : listOfEmployees)
            System.out.println(alx.whatMonth());

        //Zwracają wyciągnąć dzień urodzenia danego pracownika z peselu
        System.out.println();
        for (Pracownik alx : listOfEmployees)
            System.out.println(alx.whatDay());

        System.out.println();
        System.out.println(highestSalary(listOfEmployees).nazwisko);
        System.out.println();

        System.out.println(ifWoman(listOfEmployees).toString());

//        System.out.println(ifMan(listOfEmployees));

//        System.out.println(searchBySurname(listOfEmployees, "Gustaw"));


        System.out.println();
//        for (Pracownik alx :listOfEmployees)
//            alx.ifMan();

    }

    // - Znajdują pracownika który zarobił najwięcej
    public static Pracownik highestSalary(List<Pracownik> employees) {
        Pracownik tmp = employees.get(0);
        for (Pracownik pracownik : employees)
            if (pracownik.pensja >= tmp.pensja) {
                tmp = pracownik;
            }
        return tmp;
    }

        // Czy kobieta
    //czemu List<String>? a nie List<Pracownik>
    public static List<Pracownik> ifWoman(List<Pracownik> employees) {
        List<Pracownik> women = new ArrayList<>();

        for (Pracownik pracownik : employees)
            //metoda pomocniczna!!! isWoman()??? isMan()???
            if ((pracownik.pesel / 10 % 10) % 2 == 0)
                women.add(pracownik);
        return women;
    }


        // Czy mężczyzna
    public static List<String> ifMan(List<Pracownik> employees) {
        List<String> men = new ArrayList<>();

        for (Pracownik pracownik : employees)
            if ((pracownik.pesel / 10 % 10) % 2 != 0)
                men.add(pracownik.imie + " " + pracownik.nazwisko);
        return men;
    }

        //Szukamy pracowników o tym samym nazwisku
    public static List<String> searchBySurname(List<Pracownik> employees, String nazwiskoPracownika) {
        List<String> name = new ArrayList<>();

        for (Pracownik employee : employees)
            if (employee.nazwisko.equals(nazwiskoPracownika))
                name.add(employee.imie + " " + employee.nazwisko);

        return name;
    }
}