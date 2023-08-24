package homework.additional;

/*Реализуйте метод, который принимает объекты любого типа и возвращает список из таких объектов*/

import java.util.ArrayList;
import java.util.List;
public class ObjectsTaskBuildList {
    private ObjectsTaskBuildList() {}

    public static <T> List<T> generateList(T... input) {
        List<T> resultList = new ArrayList<>();
        for (T items : input) {
            resultList.add(items);
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println("Список разного: " + generateList(1, "2", '3', 4.5, false,"Строка"));
    }
}