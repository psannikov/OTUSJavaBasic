package homework.additional;

/*Реализуйте метод, который принимает список целочисленных значений и возвращает список только с чётными значениями.
Элементы в списке могут иметь значение null.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsTaskEvenIntegers {
    private ObjectsTaskEvenIntegers(){}

    public static List<Integer> evenIntegers(List<Integer> integers) {
        List<Integer> res = new ArrayList<Integer>();
        for (Integer numb: integers) {
            if (numb != null) {
                if (numb%2 == 0) {
                    res.add(numb);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Только чётные числа: " + evenIntegers(Arrays.asList(1, 2, 3, null, 44, 45, 46, null, null, -11, -12)));
    }
}
