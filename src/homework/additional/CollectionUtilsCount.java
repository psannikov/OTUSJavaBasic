package homework.additional;
/*Реализуйте метод, который принимает массив элементов и возвращает Map<K,
Integer> где K - элемент массива, Integer — количество таких элементов в массиве*/
import java.util.*;

public class CollectionUtilsCount {
    public static <K> Map<K, Integer> countElements(K[] inputArray) {
        Map <K, Integer> result = new HashMap<>();
        for (K element : inputArray) {
            if (result.containsKey(element)) {
                result.put(element,result.get(element).intValue() + 1);
            } else {
                result.put(element,1);
            }
        }
        return result;
    }

    private CollectionUtilsCount() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе массива [1, 2, 4, 1, 1, 1, 2, 3, 2], метод должен вернуть [\"1\", 4, \"2\", 3, \"4\", 1, \"3\", 1] - "
                + CollectionUtilsCount.countElements(new String[]{"1", "2", "4", "1", "1", "1", "2", "3", "2"}));
    }
}
