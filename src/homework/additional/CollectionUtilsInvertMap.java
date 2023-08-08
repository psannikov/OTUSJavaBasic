package homework.additional;
/*Реализуйте метод, принимающий Map<K, V> и возвращающий Map, в котором ключи и значения поменяны местами*/
import java.util.*;

public class CollectionUtilsInvertMap {
    public static <K, V> Map<V, K> invertMap(Map<? extends K, ? extends V> inputMap) {
        Map<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<? extends K, ? extends V> entry : inputMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            invertedMap.put(value, key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> inputMap = Map.of(1, "a", 2, "b", 3, "c");
        Map<String, Integer> invertedMap = CollectionUtilsInvertMap.invertMap(inputMap);

        // Output the result of the inverted map.
        System.out.println("Original Map: " + inputMap);
        System.out.println("Inverted Map: " + invertedMap);
    }
}

