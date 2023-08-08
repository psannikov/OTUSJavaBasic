package homework.additional;

import java.util.*;

public class CollectionUtilsUniqueValues {
    public static <T> Collection<T> removeDuplicates(Collection<T> inputCollection) {
        Set<T> set = new HashSet<>();
        for (T x : inputCollection) {
            set.add(x);
        }
        return set;
    }

    private CollectionUtilsUniqueValues() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе коллекции (1, 2, 3, 3, 2, 4) метод должен вернуть (1, 2, 3, 4) - "
                + homework.additional.CollectionUtilsUniqueValues.removeDuplicates(List.of(1, 2, 3, 3, 2, 4)));
    }
}
