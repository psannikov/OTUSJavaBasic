package main;

import java.util.ArrayList;

public class ExistsCurrencyInData{
    WorkWithFile workWithFile;
    public ExistsCurrencyInData(WorkWithFile workWithFile) {
        this.workWithFile = workWithFile;
    }
    public boolean checkExistsCurrencyInData (String dataSearch, String fileName) {
        boolean res = false;
        ArrayList<String> data = workWithFile.readFile(fileName);
        for (String line : data) {
            if (line.split(";")[0].equals(dataSearch)) {
                res = true;
                break;
            }
        }
        return res;
    }
}
