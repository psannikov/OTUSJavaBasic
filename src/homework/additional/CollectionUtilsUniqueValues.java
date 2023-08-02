package homework.additional;

import java.util.*;

public class CollectionUtilsUniqueValues {
    public static <T> Collection<T> removeDuplicates(Collection<T> inputCollection) {
        Collection<T> uniqueCollection = new ArrayList<>();
        for (T item : inputCollection) {
            if (uniqueCollection.isEmpty() | !uniqueCollection.contains(item)) {
                uniqueCollection.add(item);
            }
        }
        return uniqueCollection;
    }

    private CollectionUtilsUniqueValues() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе коллекции (1, 2, 3, 3, 2, 4) метод должен вернуть (1, 2, 3, 4) - "
                + CollectionUtilsUniqueValues.removeDuplicates(List.of(1, 2, 3, 3, 2, 4,5,5,3,1,2,0,56,23,567865,23)));
        System.out.println("При вводе коллекции (1, 2, 3, 3, 2, 4) метод должен вернуть (1, 2, 3, 4) - "
                + CollectionUtilsUniqueValues.removeDuplicates(List.of("слово1","слово2","слово3","слово1")));
    }
}
