package homework.additional;

import java.util.Arrays;

public class ExceptionTaskDivide {
    private ExceptionTaskDivide(){}

    public static int[] divide(int... numbers) {
        if (numbers.length % 2 != 0) {
            throw new IllegalArgumentException("The number of elements must be even.");
        }

        int[] results = new int[numbers.length / 2];
        for (int i = 0; i < numbers.length; i += 2) {
            int dividend = numbers[i];
            int divisor = numbers[i + 1];

            try {
                results[i / 2] = divisor != 0 ? dividend / divisor : 0;
            } catch (ArithmeticException e) {
                results[i / 2] = 0;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println("Делим попарно 4, 2, 4, 1: " + Arrays.toString(divide(4, 2, 4, 1)));
        System.out.println("Делим попарно 0, 2, 0, 0: " + Arrays.toString(divide(0, 2, 0, 0)));
    }
}