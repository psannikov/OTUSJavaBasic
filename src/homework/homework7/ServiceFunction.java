package homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceFunction {
    private static int countOfFailures = 0;

    static void printText(String... text) {
        for (String s : text) {
            System.out.println(s);
        }
    }

    static String getStringWithPrintedText(String text) throws IOException {
        printText(text);
        //Вот тут try-with-resources реализация
        try (BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in))) {
            return BUFFERED_READER.readLine();
        }
    }

    static int getIntegerWithPrintedText(String text) throws IOException {
        int result = 0;
        try {
            System.out.println(countOfFailures);
            countOfFailures++;
            System.out.println(countOfFailures);
            result = Integer.parseInt(getStringWithPrintedText(text));
        } catch (NumberFormatException e) {
            if (countOfFailures > 3) {
                System.out.println(countOfFailures);
                //Это 5ый способ - выброс выше
                throw new ExceptionInInitializerError("Слышком много неудачных попыток завершаем попытку ввода");
            }
            //Тут я делаю 7 вариант - повторная попытка вызова метода
            printText("Вы ввели не целое число повторите, пожалуйста повторите попытку");
            getIntegerWithPrintedText(text);
        }
        return result;
    }
}
