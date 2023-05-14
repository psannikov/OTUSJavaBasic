package homework.homework3;

public class FunctionUtilsGetMax {
    public static int getMax(int... numbers) {
        int numbMax = -2147483648;
        for (int num : numbers) {
            if (num >= numbMax) {
                numbMax = num;
            }
        }
        return numbMax;
    }

    private FunctionUtilsGetMax() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива [1, 6, 9, 0, 15, 3], метод должен вернуть число 15 - '"
                        + FunctionUtilsGetMax.getMax(1, 6, 9, 0, 15, 3)
                        + "'"
        );
    }
}