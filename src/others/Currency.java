package others;
import java.util.ArrayList;
import java.util.Scanner;

import static others.WorkWithFile.*;

public class Currency {

    public Currency() {
        final String FILE_NAME = "data.txt";
        String[] currencyData = new String[5];
        Scanner scanner = new Scanner(System.in);
        String dataToWrite;
        boolean cycleBoolean = true;
        System.out.print("Укажите валюту в которой будет выполнятся работа: ");
        currencyData[0] = scanner.next();
        if (checkData(currencyData[0],FILE_NAME)) {
            System.out.println("В справочнике системы не найдено информации о данной валюте");
            System.out.println("Необходимо заполнить информацию о валюте");
            System.out.print("Для заполнения справочника введите ДА ");
            if (scanner.next().equalsIgnoreCase("ДА")) {
                System.out.println("Заполнение информации по валюте: " + currencyData[0]);
                while (cycleBoolean) {
                    System.out.println("Укажите цифрой изменяемое ли это слово, возможные варианты ответа: да, нет");
                    currencyData[1] = scanner.next().toLowerCase();
                    if ((currencyData[1].equals("да")) || (currencyData[1].equals("нет"))) {
                        cycleBoolean = false;
                    } else {
                        System.out.println("Вы указали некорректное значение пожалуйста повторите ввод");
                    }
                }
                if (currencyData[1].equals("да")) {
                    System.out.println("Укажите как пишется валюта в именительном падеже: ");
                    currencyData[2] = scanner.next();
                    System.out.println("Укажите как пишется валюта в родительном падеже единственном числе: ");
                    currencyData[3] = scanner.next();
                    System.out.println("Укажите как пишется валюта в родительном падеже множественном числе: ");
                    currencyData[4] = scanner.next();
                }
                System.out.println("Будет добавлена информация о валюте:\nНазвание: " + currencyData[0] +
                        "\nИзменяемая форма слова: " + currencyData[1] + "\nФорма именительного падежа: " + currencyData[2] +
                        "\nФорма родительного падежа единственного числа: " + currencyData[3] +
                        "\nФорма родительного падежа множественного числа: " + currencyData[4]);
                dataToWrite = currencyData[0] + ";" + currencyData[1] + ";" + currencyData[2] + ";" +
                        currencyData[3] + ";" + currencyData[4];
                writeFile(dataToWrite, FILE_NAME);
            } else {
                //TODO реализовать завершение работы конструктора и откат создания объекта
            }
        } else {
            ArrayList<String> data = readFile(FILE_NAME);
            for (String line : data) {
                if (line.split(";")[0].equals(currencyData[0])) {
                    currencyData[1] = line.split(";")[1];
                    currencyData[2] = line.split(";")[1];
                    currencyData[3] = line.split(";")[1];
                    currencyData[4] = line.split(";")[1];
                }
            }
        }
//
//        }
    }
}
