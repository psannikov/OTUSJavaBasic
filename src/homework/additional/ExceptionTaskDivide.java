package homework.additional;
/* Реализуйте метод, который принимает чётное количество целочисленных элементов и попарно делит их друг на друга.
 * Если в качестве делителя встречается ноль, то нужно отловить ArithmeticException и записать в качестве результата 0.
 * Если общее количество элементов не является чётным, метод должен бросить IllegalArgumentException
 * Метод должен вернуть массив с результатами деления (использовать обычное деление).
 */
import java.util.Arrays;

public class ExceptionTaskDivide {
    private ExceptionTaskDivide(){}

    public static int[] divide(int... numbers) {
//TODO
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Делим попарно 4, 2, 4, 1: " + Arrays.toString(divide(4, 2, 4, 1)));
        System.out.println("Делим попарно 0, 2, 0, 0: " + Arrays.toString(divide(0, 2, 0, 0)));
    }
}