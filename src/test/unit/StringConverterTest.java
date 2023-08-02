package test.unit;

import assertions.Assertions;
import main.Currencies;
import main.IOService;
import main.StringConverter;
import test.unit.fake.CurrencyStub;
import test.unit.fake.ServiceFunctionStub;

import java.io.PrintStream;

public class StringConverterTest {
    IOService serviceFunction = new ServiceFunctionStub();
    Currencies currency = new CurrencyStub();
    StringConverter stringConverter = new StringConverter(serviceFunction, currency);
    public void test1rub () {
        String scenario = "Тест преобразования в строку с валютой оканчивающейся на 1, в пределах тысячи";
        try {
            String expected = "один рубль";
            stringConverter.setValueToConvert();
            String actual = stringConverter.convertValueToString();
            Assertions.assertEquals(expected, actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void test2357rub () {
        String scenario = "Тест преобразования в строку с валютой оканчивающейся на не 1,2,3, в пределах миллиона";
        try {
            String expected = "две тысячи триста пятьдесят семь рублей";
            stringConverter.setValueToConvert();
            String actual = stringConverter.convertValueToString();
            Assertions.assertEquals(expected, actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void test1246892rub () {
        String scenario = "Тест преобразования в строку с валютой оканчивающейся на 2 или 3, более миллиона";
        try {
            String expected = "один миллион двести сорок шесть тысяч восемьсот девяносто два рубля";
            stringConverter.setValueToConvert();
            String actual = stringConverter.convertValueToString();
            Assertions.assertEquals(expected, actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void testLoverMinValue() {
        Throwable actual = null;
        String scenario = "Тест получения значения меньше минимально допустимого значения 1";
        try {
            stringConverter.setValueToConvert();
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario);
            throw new AssertionError("Ожидается что приложение отдаст ошибку, введеное значение меньше минимального");
        } else {
            Assertions.assertEquals(RuntimeException.class, actual.getClass());
            System.out.printf("\"%s\" passed %n", scenario);;
        }
    }
    public void testBiggerMaxValue() {
        Throwable actual = null;
        String scenario = "Тест получения значения больше максимально допустимого значения 999999999";
        try {
            stringConverter.setValueToConvert();
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario);
            throw new AssertionError("Ожидается что приложение отдаст ошибку, введеное значение больше максимального");
        } else {
            Assertions.assertEquals(RuntimeException.class, actual.getClass());
            System.out.printf("\"%s\" passed %n", scenario);;
        }
    }
}
