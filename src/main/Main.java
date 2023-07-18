package main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IOService ioService = new ServiceFunction(System.out, System.in);
        WorkWithFile workWithFile = new WorkWithFile(ioService);
        ExistsCurrencyInData existsCurrencyInData = new ExistsCurrencyInData(workWithFile);
        Currency currency = new Currency(ioService, workWithFile, existsCurrencyInData);
        StringConverter stringConverter = new StringConverter(ioService, currency);
        stringConverter.setValueToConvert();
        ioService.printText(stringConverter.convertValueToString());
    }
}
