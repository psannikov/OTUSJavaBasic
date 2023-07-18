package test.unit.fake;

import main.IOService;

import java.io.IOException;

public class ServiceFunctionStub implements IOService {


    @Override
    public void printText(String... text) {

    }

    @Override
    public String getStringWithPrintedText(String text) throws IOException {
        return null;
    }

    @Override
    public int getIntWithPrintedText(String text) throws IOException {
        return 0;
    }
}
