package test06.zad2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 50, 60, 7, 8, 9));
        System.out.println(method(list, 3));
    }

    public static List<Integer> method(List<Integer> listaIntegerow, int topX) {
        return Optional.ofNullable(listaIntegerow)
                .map(x -> x.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(topX)
                        .toList()
                ).orElse(Collections.emptyList());
    }
}
