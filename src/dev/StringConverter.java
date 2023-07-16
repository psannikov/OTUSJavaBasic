package dev;

import java.io.IOException;

import static dev.ServiceFunction.getIntWithPrintedText;
import static dev.ServiceFunction.printText;

public class StringConverter {
    private int value;
    Currency currency;
    public StringConverter(Currency currency) throws IOException {
        while (true) {
            int inputValue = getIntWithPrintedText("Введите число, которое требуется преобразовать в текстовый формат: ");
            if (inputValue > 999999999 && value < 1) {
                printText("Введенное число невходит в допустимый диапазон [1...999999999], введите число повторно");
            } else {
                value = inputValue;
                this.currency = currency;
                break;
            }
        }
    }
    public String convertValueToString() {
        int valuePartUnit;
        int valuePartKilo;
        int valuePartMega;
        String valueString = "";
        String string100 = "";
        String string10 = "";
        String string1 = "";
        String currencyString = "";
        String res = "";

    }



}
