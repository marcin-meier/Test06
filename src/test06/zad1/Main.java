package test06.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<Integer> listInt = List.of(-5, 2, 3, 4, 50, 5, 6, 7, 8, 20);
        MinMax<Integer> test01 = MinMaxService.getMinAndMax(listInt);
        System.out.println(test01);

        List<String> listString = List.of("A", "D", "C", "B");
        MinMax<String> test02 = MinMaxService.getMinAndMax(listString);
        System.out.println(test02);

        List<Person> listOfPeople = generateListOfXPeople(10, Person::new);
        MinMax<Person> test03 = MinMaxService.getMinAndMax(listOfPeople);
        System.out.println(test03);
    }

    public static List<Person> generateListOfXPeople(int x, Supplier<Person> supplier) {
        List<Person> resultList = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            resultList.add(supplier.get());
        }
        return resultList;
    }
}
