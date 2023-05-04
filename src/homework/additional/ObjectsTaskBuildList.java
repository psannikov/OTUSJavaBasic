package homework.additional;

/*Реализуйте метод, который принимает объекты любого типа и возвращает список из таких объектов*/

import java.util.Collections;
import java.util.List;
public class ObjectsTaskBuildList {
    private ObjectsTaskBuildList() {}

    public static <T> List<T> generateList(T... input) {
//TODO
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("Список разного: " + generateList(1, "2", '3', 4.5, false));
    }
}