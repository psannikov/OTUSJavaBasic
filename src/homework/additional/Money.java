package homework.additional;

public class Money {
    private int base;
    private int fractional;

    public Money(int base, int fractional) {
        this.base = base;
        this.fractional = fractional;
    }

    public String getAmount() {
        String baseString = String.valueOf(this.base);
        String fractionalString;
        if (this.fractional < 10) {
            fractionalString = "0" + String.valueOf(this.fractional);
        } else {
            fractionalString = String.valueOf(this.fractional);
        }
        return baseString + "," + fractionalString;
    }

    public static void main(String[] args) {
        System.out.println("100 рублей, 90 копеек: " + new Money(0, 0).getAmount());
        System.out.println("0 рублей, 1 копейка: " + new Money(12, 3).getAmount());
    }
}
