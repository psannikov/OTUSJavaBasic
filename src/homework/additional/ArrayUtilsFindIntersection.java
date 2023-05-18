package homework.homework3;

import java.util.Arrays;

public class ArrayUtilsFindIntersection {

    public static int[] findIntersection(int[] rightArray, int[] leftArray) {
        int[] res = {};
        for (int rightArrayElement : rightArray) {
            for (int leftArrayElement : leftArray) {
                if (rightArrayElement == leftArrayElement) {
                    res = Arrays.copyOf(res, res.length + 1);
                    res[res.length - 1] = rightArrayElement;
                }
            }
        }
        return res;
    }

    private ArrayUtilsFindIntersection() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массивов [1,4,7,3,8,5,3] и [9,12,7,4,3] метод должен вернуть массив [4,7] - '"
                        + Arrays.toString(ArrayUtilsFindIntersection.findIntersection(new int[]{1, 4, 7, 3, 8,5,5}, new int[]{9, 12, 7, 4,3}))
                        + "'"
        );
    }
}