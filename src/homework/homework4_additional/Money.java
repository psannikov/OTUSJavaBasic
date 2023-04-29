package homework.homework4_additional;

/*Реализуйте класс, который принимает целую и дробную часть денежной суммы и возвращает полное значение строкой.
Целую и дробную части в строке разделять запятой.*/

public class Money {
//TODO

    public Money(int base, int fractional) {
//TODO
    }

    public String getAmount() {
//TODO
        return "";
    }

    public static void main(String[] args) {
        System.out.println("100 рублей, 90 копеек: " + new Money(100, 90).getAmount());
        System.out.println("0 рублей, 1 копейка: " + new Money(0, 1).getAmount());
    }
}
