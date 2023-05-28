package test06.zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    private static List<Figure> listOfFigures = new ArrayList<>();

    public static void main(String[] args) {

        Map<String, Function<String[], Figure>> map = new HashMap<>();
        map.put("SQUARE", dimenions -> new Square(Integer.parseInt(dimenions[1])));
        map.put("RECTANGLE", dimensions -> new Rectangle(Integer.parseInt(dimensions[1]), Integer.parseInt(dimensions[2])));
        map.put("CIRCLE", dimenions -> new Circle(Integer.parseInt(dimenions[1])));

        try (BufferedReader input = new BufferedReader(new FileReader("src/test06/zad3/figury.txt"))) {
            String line;
            while ((line = input.readLine()) != null) {
                String[] tab = line.split(";");
                Function<String[], Figure> createFigure = map.get(tab[0]);
                listOfFigures.add(createFigure.apply(tab));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        - ile jest kwadratow
        System.out.println(countMatchingInstance(listOfFigures, Square.class::isInstance));

//        - dla kazdej figury wypisac jej pole oraz obwod.
        consume(listOfFigures, y -> System.out.println("Area: " + y.calculateArea() + ", Perimeter: " + y.calculatePerimeter()));

    }

    private static <T> int countMatchingInstance(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result.size();
    }

    private static <T> void consume(List<T> list, Consumer<T> consumer) {
        for (T t : list)
            consumer.accept(t);
    }

}
