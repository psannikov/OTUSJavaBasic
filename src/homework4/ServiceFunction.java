package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceFunction {
    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    static void printText(String... text) {
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
    }
    static String getStringWithPrintedText(String text) throws IOException {
        printText(text);
        return BUFFERED_READER.readLine();
    }
}
