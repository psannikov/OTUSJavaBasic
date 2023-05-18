package homework.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static homework.homework5.BubbleSort.getBubbleSortedArray;
import static homework.homework5.MergeSort.getmergeSortedArray;

public class Test {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void printFirstNumbsFromArray (int[] array, int n) {
        System.out.println("Печать первых " + n + " чисел массива");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("=".repeat(50));
    }
    public static void main(String[] args) {
        long startTime;
        long endTime;
        final int N = 10;
        int[] testArray = new int[100000];
        for (int i =0; i < testArray.length; i++) {
            testArray[i] = getRandomNumber(1,10000000);
        }
        List<Integer> list = new ArrayList<>(Arrays.stream(testArray).boxed().toList());
        int[] sortedArray;
        System.out.println("Исходный массив");
        printFirstNumbsFromArray(testArray, N);
        System.out.println("Сортированный массив метод пузырька");
        startTime = System.currentTimeMillis();
        sortedArray = getBubbleSortedArray(testArray);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + Long.toString(endTime - startTime) + " мулисекунд");
        printFirstNumbsFromArray(sortedArray, N);
        System.out.println("Сортированный массив методом слияния");
        startTime = System.currentTimeMillis();
        sortedArray = getmergeSortedArray(testArray);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + Long.toString(endTime - startTime) + " мулисекунд");
        printFirstNumbsFromArray(sortedArray, N);
        startTime = System.currentTimeMillis();
        Collections.sort(list);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + Long.toString(endTime - startTime) + " мулисекунд");
        for (int i = 0; i < N; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
