package homework.additional;
/*Реализуйте метод, который принимает два списка и сравнивает равны ли множества их элементов*/
import java.util.*;

public class CollectionUtilsElementComparison {
    public static boolean isValuesMatch(List<?> leftList, List<?> rightList) {
        boolean result = true;
        if (leftList.size() != rightList.size()){
            result = false;
        } else  {
            for (int i = 0; i < leftList.size(); i++) {
                if (!leftList.get(i).equals(rightList.get(i))) {
                    result = false;
                }
            }
        }
        return result;
    }
    private CollectionUtilsElementComparison(){

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массивов: (1, 2, 3) и (4, 5, 6), метод должен вернуть false - '"
                        + CollectionUtilsElementComparison.isValuesMatch(List.of(1, 2, 3), List.of(1,2))
                        + "'"
        );
    }
}
