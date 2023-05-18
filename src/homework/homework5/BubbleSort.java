package homework.homework5;
/*Реализовать сортировку массива чисел используя любой алгоритм из представленных на занятии
(или свой, но с комментариями).*/
public class BubbleSort {
    public static int[] getBubbleSortedArray (int[] array) {
        //Для начала проверяем длинну массива если меньше 2 он уже отсортирован
        if (array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
     return array;
    }
}
