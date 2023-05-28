package test06.zad1;

import java.util.Collections;
import java.util.List;
import static java.util.Objects.isNull;

public class MinMaxService {



    public static <T extends Comparable<T>> MinMax<T> getMinAndMax(List<T> elements) {
        if (isNull(elements) || elements.isEmpty())
            throw new IllegalArgumentException();
        return new MinMax<>(Collections.max(elements), Collections.min(elements));
    }
}
