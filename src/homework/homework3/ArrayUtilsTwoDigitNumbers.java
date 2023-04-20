package homework.homework3;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilsTwoDigitNumbers {
    public static int[] fillArrayByTwoDigitNumbers(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int min = 10;
            int max = 99;
            Random random = new Random();
            inputArray[i] = random.nextInt(max - min) + min;
        }
        return inputArray;
    }
    private ArrayUtilsTwoDigitNumbers() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива длиной 5, метод должен вернуть массив случайных двузначных чисел - '"
                        + Arrays.toString(ArrayUtilsTwoDigitNumbers.fillArrayByTwoDigitNumbers(new int[5]))
                        +"'"
        );
    }
}