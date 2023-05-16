package homework.additional;
/*Реализуйте метод, принимающий Map<K, V> и возвращающий Map, в котором ключи и значения поменяны местами*/
import java.util.*;

public class CollectionUtilsInvertMap {
    public static <K, V> Map<V, K> invertMap(Map<? extends K, ? extends V> inputMap) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<? extends K, ? extends V> items : inputMap.entrySet()) {
            result.put(items.getValue(),items.getKey());
        }
        return result;
    }

    private CollectionUtilsInvertMap() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе Map {1=a, 2=b, 3=c} метод должен вернуть {a=1, b=2, c=3} - '"
                + CollectionUtilsInvertMap.invertMap(Map.of(1, "a", 2, "b", 3, "c")) + "'");
    }
}
