package test.unit.fake;

import main.IOService;

import java.io.IOException;

public class ServiceFunctionStub implements IOService {
    private static int countRun = 0;

    @Override
    public void printText(String... text) {

    }

    @Override
    public String getStringWithPrintedText(String text) throws IOException {
        return null;
    }

    @Override
    public int getIntWithPrintedText(String text) throws IOException {
        int res = 0;
        countRun += 1;
        if (countRun == 1) {
            res = 1;
        } else if (countRun == 2) {
            res = 2357;
        } else if (countRun == 3) {
            res = 1246892;
        } else if (countRun == 4) {
            res = -1;
        } else if (countRun == 5) {
        res = 1999999999;
    }
        return res;
    }
}
