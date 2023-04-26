package others;

public class PriceToWords {
    public static void main(String[] args) {
        Currency currency = new Currency();
        Value value = new Value(currency);
        System.out.println(value.convertValueToString());
    }
}
