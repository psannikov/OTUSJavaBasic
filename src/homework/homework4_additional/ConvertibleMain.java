package homework.homework4_additional;

/*Реализуйте классы для конвертации расстояния из километров в мили и из километров в версты.
Для расчётов использовать константы, объявленные в интерфейсе Convertible.
Результат округлить в меньшую сторону функцией Math.floor().*/

public class ConvertibleMain {
    public static void main(String[] args) {
        System.out.println("100 километров в милях = " + new Mile().parseValue(100));
        System.out.println("0,99 километров в верстах = " + new Verst().parseValue(0.99));
    }
}

interface Convertible {
    double KILOS_IN_MILE = 1.6;
    double KILOS_IN_VERST = 0.95;

    long parseValue(double kilosValue);
}

class Mile implements Convertible {
    @Override
    public long parseValue(double kilosValue) {
        //TODO
        return 0;
    }
}

class Verst implements Convertible {
    @Override
    public long parseValue(double kilosValue) {
        //TODO
        return 0;
    }
}
