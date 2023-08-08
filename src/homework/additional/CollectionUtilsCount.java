package homework.additional;
/*Реализуйте метод, который принимает массив элементов и возвращает Map<K,
Integer> где K - элемент массива, Integer — количество таких элементов в массиве*/
import java.util.*;

import java.util.*;

public class CollectionUtilsCount {
    public static <K> Map<K, Integer> countElements(K[] inputArray) {
        Map<K, Integer> countMap = new HashMap<>();

        for (K element : inputArray) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        return countMap;
    }

    private CollectionUtilsCount() {
        // private constructor to prevent instantiation of this utility class
    }

    public static void main(String[] args) {
        System.out.println("При вводе массива [1, 2, 4, 1, 1, 1, 2, 3, 2], метод должен вернуть: "
                + CollectionUtilsCount.countElements(new String[]{"1", "2", "4", "1", "1", "1", "2", "3", "2"}));
    }
}