package main;

import java.io.*;
import java.util.Scanner;

public class ServiceFunction implements IOService{
//    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    private final PrintStream out;
    private final Scanner in;
    public ServiceFunction(PrintStream out, InputStream in) {
        this.out = out;
        this.in = new Scanner(in);
    }
    @Override
    public void printText(String... text) {
        for (String s : text) {
            out.println(s);
        }
    }
    @Override
    public String getStringWithPrintedText(String text) throws IOException {
        printText(text);
        return in.nextLine();
    }
    @Override
    public int getIntWithPrintedText(String text) throws IOException {
        return Integer.parseInt(getStringWithPrintedText(text));
    }
}
