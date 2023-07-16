package dev;

import java.io.*;
import java.util.ArrayList;

import static dev.ServiceFunction.printText;

public class WorkWithFile {
    public static ArrayList<String> readFile (String fileName) {
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
            printText("Exception occurred: " + e.getMessage());
        }
        return res;
    }
    public static void writeFile (String newData, String fileName) {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newData+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            printText("Exception occurred: " + e.getMessage());
        }
    }
    }

