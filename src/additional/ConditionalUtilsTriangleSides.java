package homework.homework3;

public class ConditionalUtilsTriangleSides {
    public static boolean isTriangleSides(int aSide, int bSide, int cSide) {
        return (aSide + bSide > cSide) && (aSide + cSide > bSide) && (bSide + cSide > aSide);
    }

    private ConditionalUtilsTriangleSides() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе сторон треугольника 1, 2 и 3, метод должен вернуть false - "
                + ConditionalUtilsTriangleSides.isTriangleSides(1, 2, 3));
    }
}