package main;

import java.io.IOException;
import java.util.ArrayList;

public class Currency {
    private final IOService ioService;
    private WorkWithFile workWithFile;
    private ExistsCurrencyInData existsCurrencyInData;
    final String FILE_NAME = "currency.txt";
    private String name;
    private boolean isChanged;
    private String genus;
    private String nominativeCase;
    private String genitiveSingular;
    private String genitivePlural;

    public Currency(IOService ioService, WorkWithFile workWithFile, ExistsCurrencyInData existsCurrencyInData) throws IOException, RuntimeException {
        this.ioService = ioService;
        this.workWithFile = workWithFile;
        this.existsCurrencyInData = existsCurrencyInData;
        final String answerYes = "да";
        final String answerNo = "нет";
        final String answerMale = "мужской";
        final String answerFemale = "женский";
        final String answerNeuter = "средний";
        boolean cycleBoolean = true;
        String inputCurrency = ioService.getStringWithPrintedText("Укажите валюту в которой будет выполнятся работа: ");
        if (existsCurrencyInData.checkExistsCurrencyInData(inputCurrency,FILE_NAME)) {
            String[] currencyData = getExistsCurrencyInData(inputCurrency);
            this.name = currencyData[0];
            this.isChanged = Boolean.valueOf(currencyData[1]);
            this.genus = currencyData[2];
            this.nominativeCase = currencyData[3];
            this.genitiveSingular = currencyData[4];
            this.genitivePlural = currencyData[5];
            ioService.printText("Найденная информация о валюте", getCurrencyAsStringToPrint());
        } else {
            ioService.printText("В справочнике системы не найдено информации о данной валюте",
                    "Необходимо заполнить информацию о валюте");
            if (ioService.getStringWithPrintedText("Для заполнения справочника введите ДА, иначе ввод будет завершен ").equalsIgnoreCase(answerYes)) {
                this.name = inputCurrency;
                ioService.printText("Заполнение информации по валюте: " + inputCurrency);
                while (cycleBoolean) {
                    String inputIsChanged = ioService.getStringWithPrintedText("Укажите изменяемое ли это слово, возможные варианты ответа: да, нет").toLowerCase();
                    if ((inputIsChanged.equals(answerYes)) || (inputIsChanged.equals(answerNo))) {
                        this.isChanged = inputIsChanged.equals(answerYes);
                        cycleBoolean = false;
                    } else {
                        ioService.printText("Вы указали некорректное значение пожалуйста повторите ввод");
                    }
                }
                cycleBoolean = true;
                while (cycleBoolean) {
                    String inputGenus = ioService.getStringWithPrintedText("Укажите какого рода данное слово, возможные варианты ответа: мужской, женский, средний").toLowerCase();
                    if ((inputGenus.equals(answerMale)) || (inputGenus.equals(answerFemale)) || (inputGenus.equals(answerNeuter))) {
                        this.genus = inputGenus;
                        cycleBoolean = false;
                    } else {
                        ioService.printText("Вы указали некорректное значение пожалуйста повторите ввод");
                    }
                }
                if (this.isChanged) {
                    this.nominativeCase = ioService.getStringWithPrintedText("Укажите как пишется валюта в именительном падеже: ");
                    this.genitiveSingular = ioService.getStringWithPrintedText("Укажите как пишется валюта в родительном падеже единственном числе: ");
                    this.genitivePlural = ioService.getStringWithPrintedText("Укажите как пишется валюта в родительном падеже множественном числе: ");
                }
                ioService.printText("Будет добавлена информация о валюте:\n",getCurrencyAsStringToPrint());
                String dataToWrite = this.name + ";" + this.isChanged + ";" + this.genus + ";" + this.nominativeCase + ";" + this.genitiveSingular + ";" + this.genitivePlural;
                workWithFile.writeFile(dataToWrite, FILE_NAME);
            } else {
                ioService.printText("Вы отказались от ввода данных о валюте, завершение работы программы");
                Exception e = new RuntimeException("Отказ от ввода данных о валюте");
            }
        }
    }
    public String[] getExistsCurrencyInData (String currency) {

        ArrayList<String> data = workWithFile.readFile(FILE_NAME);
        for (String line : data) {
            if (line.split(";")[0].equals(currency)) {
                return line.split(";");
            }
        }
        return null;
    }
    public String getCurrencyAsStringToPrint() {
        return "Название: " + name + "\nИзменяемая форма слова: " + isChanged + "\nРод слова: " + genus + "\nФорма именительного падежа: " + nominativeCase + "\nФорма родительного падежа единственного числа: " + genitiveSingular + "\nФорма родительного падежа множественного числа: " + genitivePlural;
    }

    public String getGenus() {
        return genus;
    }

    public boolean isChanged() {
        return isChanged;
    }

    public String getName() {
        return name;
    }

    public String getNominativeCase() {
        return nominativeCase;
    }

    public String getGenitiveSingular() {
        return genitiveSingular;
    }

    public String getGenitivePlural() {
        return genitivePlural;
    }
}
