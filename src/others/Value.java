package others;

import java.util.Scanner;

public class Value {
    int value;
    public Value() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, которое требуется преобразовать в текстовый формат: ");
        value = scanner.nextInt();
        //TODO добавить обработчик исключений
        //TODO подумать как вводить числа больше int
    }
    public String convertValueToString () {
        int[] arrayValue = new int[4];
        arrayValue[3] = value/1000_000_000;
        arrayValue[2] = (value%1000_000_000)/1000_000;
        arrayValue[1] = (value%1000_000)/1000;
        arrayValue[0] = value%1000;
        return "Миллиардов: " + arrayValue[3] + "\nМиллионов: " + arrayValue[2] + "\nТысяч: " + arrayValue[1] +
                "\nЕдиниц: " + arrayValue[0];
    }
}
