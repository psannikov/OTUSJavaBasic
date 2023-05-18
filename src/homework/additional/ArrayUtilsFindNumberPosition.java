package homework.homework3;

import java.util.*;

public class ArrayUtilsFindNumberPosition {
    public static int[] findNumberPosition(int[][] input, int number) {
        int[] res = {};
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == number) {
                    res = Arrays.copyOf(res, 2);
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;
    }
    private ArrayUtilsFindNumberPosition() {

    }

    public static void main(String[] args) {
        int[][] input = new int[][] {{5,7,3,17}, {7,0,1,12}};
        System.out.println(
                "При вводе массива [[5, 7, 3, 17], [7, 0, 1, 12]] и числа 7, метод должен вернуть массив [1, 0] - '"
                        + Arrays.toString(ArrayUtilsFindNumberPosition.findNumberPosition(input, 7))
                        + "'"
        );
    }
}