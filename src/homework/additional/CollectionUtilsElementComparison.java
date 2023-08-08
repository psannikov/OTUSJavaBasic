package homework.additional;
/*Реализуйте метод, который принимает два списка и сравнивает равны ли множества их элементов*/
import java.util.*;

public class CollectionUtilsElementComparison {
    public static boolean isValuesMatch(List<?> leftList, List<?> rightList) {
        Set<?> leftSet = new HashSet<>(leftList);
        Set<?> rightSet = new HashSet<>(rightList);
        return leftSet.equals(rightSet);
    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массивов: (1, 2, 3) и (4, 5, 6), метод должен вернуть false - '"
                        + CollectionUtilsElementComparison.isValuesMatch(List.of(1, 2, 3), List.of(4, 5, 6))
                        + "'"
        );
    }
}

