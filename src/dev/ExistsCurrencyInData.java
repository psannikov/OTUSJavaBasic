package dev;

import java.util.ArrayList;

import static dev.WorkWithFile.readFile;

public class ExistsCurrencyInData{
    public static boolean checkExistsCurrencyInData (String dataSearch, String fileName) {
        boolean res = false;
        ArrayList<String> data = readFile(fileName);
        for (String line : data) {
            if (line.split(";")[0].equals(dataSearch)) {
                res = true;
                break;
            }
        }
        return res;
    }
}
