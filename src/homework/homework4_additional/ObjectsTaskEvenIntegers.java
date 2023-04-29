package homework.homework4_additional;

/*Реализуйте метод, который принимает список целочисленных значений и возвращает список только с чётными значениями.
Элементы в списке могут иметь значение null.*/

import java.util.Arrays;
import java.util.List;

public class ObjectsTaskEvenIntegers {
    private ObjectsTaskEvenIntegers(){}

    public static List<Integer> evenIntegers(List<Integer> integers) {
//TODO
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Только чётные числа: " + evenIntegers(Arrays.asList(1, 2, 3, null, 44, 45, 46, null, null, -11, -12)));
    }
}
