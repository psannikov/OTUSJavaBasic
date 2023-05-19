package homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceFunction {
    static void printText(String... text) {
        for (String s : text) {
            System.out.println(s);
        }
    }
    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    static String getStringWithPrintedText(String text) throws IOException {
        printText(text);
        return BUFFERED_READER.readLine();
    }
}
