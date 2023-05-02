package final_project;

import java.io.IOException;

import static final_project.ServiceFunction.printText;

public class PriceToWords {
    public static void main(String[] args) throws IOException {
        Currency currency = new Currency();
        Value value = new Value(currency);
        printText(value.convertValueToString());
    }
}
