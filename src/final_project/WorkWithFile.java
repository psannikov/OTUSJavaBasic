package final_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static final_project.ServiceFunction.printText;

public class WorkWithFile {
    public static ArrayList<String> readFile (String fileName) {
        ArrayList<String> res = new ArrayList<String>();
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
    public static boolean checkData (String dataSearch, String fileName) {
        boolean res = true;
        ArrayList<String> data = readFile(fileName);
        for (String line : data) {
            if (line.split(";")[0].equals(dataSearch)) {
                res = false;
                break;
            }
        }
        return res;
    }
    }

