package homework.homework4_additional;

/*Реализуйте класс, который принимает целую и дробную часть денежной суммы и возвращает полное значение строкой.
Целую и дробную части в строке разделять запятой.*/

public class Money {
    private int base;
    private int fractional;

    public Money(int base, int fractional) {
        this.base = base;
        this.fractional = fractional;
    }

    public String getAmount() {
        String baseString = switch (this.base%10) {
            case 1 -> switch (this.base%100) {
                case 11 -> "рублей";
                default -> "рубль";
            };
            case 2,3,4 -> switch (this.base%100) {
                case 12,13,14 ->"рублей";
                default -> "рубля";
            };
            default -> "рублей";
        };
        String fractionalString = switch (this.fractional%10) {
            case 1 -> switch (this.fractional%100) {
                case 11 -> "копеек";
                default -> "копейка";
            };
            case 2,3,4 -> switch (this.fractional%100) {
                case 12, 13, 14 -> "копеек";
                default -> "копейки";
            };
            default -> "копеек";
        };
        return this.base + " " + baseString + ", " + this.fractional + " " + fractionalString;
    }

    public static void main(String[] args) {
        System.out.println("100 рублей, 90 копеек: " + new Money(22, 12).getAmount());
        System.out.println("0 рублей, 1 копейка: " + new Money(12, 3).getAmount());
    }
}
