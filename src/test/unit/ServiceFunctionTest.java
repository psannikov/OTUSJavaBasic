package test.unit;

import assertions.Assertions;
import main.ServiceFunction;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ServiceFunctionTest {
    private String expected = "input string";
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream(expected.getBytes());
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public void testPrintTextEquals () {
        String scenario = "Тест чтения строки";
        try {
            ServiceFunction ioService = new ServiceFunction(new PrintStream(outputStream), inputStream);
            String actual = ioService.getStringWithPrintedText(scenario);
            Assertions.assertEquals(expected, actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void testGetStringWithPrintedTextEquals(){
        String scenario = "Тест вывода строки";
        try {
            String expected = "output string";
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ServiceFunction ioService = new ServiceFunction(new PrintStream(outputStream),
                    new ByteArrayInputStream(new byte[0]));
            ioService.printText(expected);
            String actual = outputStream.toString();
            Assertions.assertEquals(expected + System.getProperty("line.separator"), actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
