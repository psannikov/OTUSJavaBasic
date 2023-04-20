package homework.homework3;

import java.util.Arrays;

public class ArrayUtilsShiftElements {
    public static int[] shiftElements(int[] inputArray) {
        int[] res = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (i < inputArray.length -1) {
                res[i] = inputArray[i + 1];
            } else if (i == inputArray.length -1) {
                res[i] = inputArray[0];
            }
        }
        return res;
    }
    private ArrayUtilsShiftElements() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива [1, 2, 3, 4, 5], метод должен вернуть массив [2, 3, 4, 5, 1] - '"
                        + Arrays.toString(ArrayUtilsShiftElements.shiftElements(new int[]{8, 2, 3, 4, 5}))
                        + "'"
        );
    }
}
