package dev;

import java.io.IOException;

import static dev.ServiceFunction.printText;

public class Main {
    public static void main(String[] args) throws IOException {
        Currency currency = new Currency();
        StringConverter stringConverter = new StringConverter(currency);
        stringConverter.setValueToConvert();
        printText(stringConverter.convertValueToString());
    }
}
