package final_project;

import java.io.IOException;
import java.util.ArrayList;

import static final_project.ServiceFunction.*;
import static final_project.ServiceFunction.printText;
import static final_project.WorkWithFile.*;

public class Currency {
    String[] currencyData = new String[6];

    public Currency() throws IOException {
        final String FILE_NAME = "/final_project/data.txt";
        String dataToWrite;
        boolean cycleBoolean = true;
        currencyData[0] = getStringWithPrintedText("Укажите валюту в которой будет выполнятся работа: ");
        if (checkData(currencyData[0],FILE_NAME)) {
            printText("В справочнике системы не найдено информации о данной валюте",
                    "Необходимо заполнить информацию о валюте");
            if (getStringWithPrintedText("Для заполнения справочника введите ДА ").equalsIgnoreCase("ДА")) {
                printText("Заполнение информации по валюте: " + currencyData[0]);
                while (cycleBoolean) {
                    currencyData[1] = getStringWithPrintedText("Укажите изменяемое ли это слово, возможные варианты ответа: да, нет").toLowerCase();
                    if ((currencyData[1].equals("да")) || (currencyData[1].equals("нет"))) {
                        cycleBoolean = false;
                    } else {
                        printText("Вы указали некорректное значение пожалуйста повторите ввод");
                    }
                }
                cycleBoolean = true;
                while (cycleBoolean) {
                    currencyData[2] = getStringWithPrintedText("Укажите какого рода данное слово, возможные варианты ответа: мужской, женский, средний").toLowerCase();
                    if ((currencyData[2].equals("мужской")) ||
                            (currencyData[2].equals("женский")) ||
                            (currencyData[2].equals("средний"))) {
                        cycleBoolean = false;
                    } else {
                        printText("Вы указали некорректное значение пожалуйста повторите ввод");
                    }
                }
                if (currencyData[1].equals("да")) {
                    currencyData[3] = getStringWithPrintedText("Укажите как пишется валюта в именительном падеже: ");
                    currencyData[4] = getStringWithPrintedText("Укажите как пишется валюта в родительном падеже единственном числе: ");
                    currencyData[5] = getStringWithPrintedText("Укажите как пишется валюта в родительном падеже множественном числе: ");
                }
                printText("Будет добавлена информация о валюте:\nНазвание: " + currencyData[0],
                        "Изменяемая форма слова: " + currencyData[1],
                        "Род слова: " + currencyData[2],
                        "Форма именительного падежа: " + currencyData[3],
                        "Форма родительного падежа единственного числа: " + currencyData[4],
                        "Форма родительного падежа множественного числа: " + currencyData[5]);
                dataToWrite = currencyData[0] + ";" + currencyData[1] + ";" + currencyData[2] + ";" +
                        currencyData[3] + ";" + currencyData[4] + ";" + currencyData[5];
                writeFile(dataToWrite, FILE_NAME);
            } else {
                //TODO реализовать завершение работы конструктора и откат создания объекта
            }
        } else {
            ArrayList<String> data = readFile(FILE_NAME);
            for (String line : data) {
                if (line.split(";")[0].equals(currencyData[0])) {
                    currencyData[1] = line.split(";")[1];
                    currencyData[2] = line.split(";")[2];
                    currencyData[3] = line.split(";")[3];
                    currencyData[4] = line.split(";")[4];
                    currencyData[5] = line.split(";")[5];
                }
            }
        }
    }
}
