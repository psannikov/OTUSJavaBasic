package homework.homework4_additional;

/*Реализовать классы геометрических фигур квадрата и круга, которые расчитывают площадь по заданным параметрам фигуры.
Результат должен быть округлён до целых чисел. Для округления нужно использовать Math.round.
Для площади круга использовать значение Math.PI.*/

public class AreaComputableMain {

    public static void main(String[] args) {
        System.out.println("Площадь квадрата со сторонами 2 и 4 = " + new Square(2, 4).computeArea());
    }
}

interface AreaComputable {
    int computeArea();
}

class Square implements AreaComputable {
    private final double width;
    private final double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int computeArea() {
        return (int)Math.round(this.height * this.width);
    }
}

class Circle implements AreaComputable {
    private final double rad;
    public Circle(double rad) {
        this.rad = rad;
    }
    @Override
    public int computeArea() {
        return (int)Math.round(Math.PI*Math.pow(rad,2));
    }
}
