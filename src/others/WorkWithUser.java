package others;
import java.util.ArrayList;
import java.util.Scanner;

import static others.WorkWithFile.*;

public class WorkWithUser {
    static String FILE_NAME = "data.txt";
    public String currency;
    public String form = "";
    public String isChanged = "";
    public int value;

    public WorkWithUser() {
        Scanner scanner = new Scanner(System.in);
        String dataToWrite;
//        String currency;
//        String form = "";
//        String isChanged = "";
        System.out.print("Укажите валюту в которой будет выполнятся работа: ");
        currency = scanner.next();
        if (checkData(currency,FILE_NAME)) {
            System.out.println("В справочнике системы не найдено информации о данной валюте");
            System.out.println("Необходимо заполнить информацию о валюте");
            System.out.print("Для заполнения справочника введите ДА ");
            if (scanner.next().toUpperCase().equals("ДА")) {
                System.out.println("Заполнение информации по валюте: " + currency);
                //TODO добавить проверку введенного
                System.out.print("Укажите какого рода данное слово, возможные варианты ответа: мужской, женский, средний ");
                form = scanner.next();
                //TODO добавить проверку введенного
                System.out.print("Укажите изменяемое ли это слово, возможные варианты ответа: да, нет");
                isChanged = scanner.next();
                System.out.println("Будет добавлена информация о валюте:\nНазвание " + currency +
                        "\nРод " + form + "\nИзменяемый " + isChanged);
            }
            dataToWrite = currency + ";" + form + ";" + isChanged;
            writeFile(dataToWrite, FILE_NAME);
        } else {
            ArrayList<String> data = readFile(FILE_NAME);
            for (String line : data) {
                if (line.split(";")[0].equals(currency)) {
                    //TODO продумать обработку исключений
                    form = line.split(";")[1];
                    isChanged = line.split(";")[2];
                }
            }
        }
//
//        }
    }
}
