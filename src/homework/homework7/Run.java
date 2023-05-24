package homework.homework7;

import static homework.homework7.ServiceFunction.getIntegerWithPrintedText;
import static homework.homework7.ServiceFunction.printText;

public class Run {
    public static void main(String[] args) {
        try {
            int radius = getIntegerWithPrintedText("Введите целое положительно число");
            if (radius <= 0) {
                throw new RuntimeException("Вы ввели не положительное число");
            }
        } catch (Exception e) {
            //Тут 2ой вариант - вывод ошибки
            printText(e.getMessage());
        }
    }
}
