package main;

import java.io.IOException;

public interface IOService {

    void printText(String... text);

    String getStringWithPrintedText(String text) throws IOException;

    int getIntWithPrintedText(String text) throws IOException;
}
