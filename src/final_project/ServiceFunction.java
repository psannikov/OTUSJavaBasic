package final_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceFunction {
    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    static void printText(String... text) {
        for (String s : text) {
            System.out.println(s);
        }
    }
    static String getStringWithPrintedText(String text) throws IOException {
        printText(text);
        return BUFFERED_READER.readLine();
    }
    static int getIntWithPrintedText(String text) throws IOException {
        return Integer.parseInt(getStringWithPrintedText(text));
    }
}
