package main;

import java.io.*;
import java.util.ArrayList;

public class WorkWithFile {
    private final IOService ioService;
    public WorkWithFile (IOService ioService) {
        this.ioService = ioService;
    }
    public ArrayList<String> readFile (String fileName) {
        ArrayList<String> res = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                res.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            ioService.printText("Exception occurred: " + e.getMessage());
        }
        return res;
    }
    public void writeFile (String newData, String fileName) {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newData+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            ioService.printText("Exception occurred: " + e.getMessage());
        }
    }
    public boolean checkExistsCurrencyInData (String dataSearch, String fileName) {
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

