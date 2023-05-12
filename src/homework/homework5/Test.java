package homework.homework5;

import static homework.homework5.BubbleSort.getBubbleSortedArray;
import static homework.homework5.MergeSort.getmergeSortedArray;

public class Test {
    public static void main(String[] args) {
        int[] testArray = {2,556,234,567,23,34655,687934,254,4567784,252347,752,234,10,3,8};
        System.out.println("Исходный массив");
        for (int numb : testArray) {
            System.out.print(numb + " ");
        }
        System.out.println();
        System.out.println("Сортированный массив метод пузырька");
        for (int numb : getBubbleSortedArray(testArray)) {
            System.out.print(numb + " ");
        }
        System.out.println();
        System.out.println("Сортированный массив методом слияния");
        for (int numb : getmergeSortedArray(testArray)) {
            System.out.print(numb + " ");
        }
    }
}
