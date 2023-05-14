package homework.homework3;

import java.util.Arrays;

public class ArrayUtilsRemoveElement {
    public static int[] removeElement(int[] nums, int val) {
        int[] res = {};
        for (int num : nums) {
            if (num != val) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = num;
            }
        }
        return res;
    }

    private ArrayUtilsRemoveElement() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива [1, 1, 2, 3, 1] и числа 1, метод должен вернуть [2, 3] - '"
                        + Arrays.toString(ArrayUtilsRemoveElement.removeElement(new int[]{1, 1, 2, 3, 1}, 1))
                        + "'"
        );
    }
}