package homework.homework5;

public class MergeSort {
    public static int[] getmergeSortedArray(int[] array) {
        //Для начала проверяем длинну массива если меньше 2 он уже отсортирован
        if (array.length< 2) {
            return array;
        }
        //Ищем длинну половины массива, чтобы потом его разбить по ней
        int mid = array.length / 2;
        //Создадим 2 половины массива
        int[] leftPart = new int[mid];
        int[] rightPart = new int[array.length - mid];
        //Копируем содержимое исходного массива в leftPart и rightPart
        for (int i = 0; i < mid; i++) {
            leftPart[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            rightPart[i - mid] = array[i];
        }
        //Рекурсивно продолжаем делить массивы leftPart и rightPart до тех пор пока не останется по 1му элементу в части (выход по return)
        leftPart = getmergeSortedArray(leftPart);
        rightPart = getmergeSortedArray(rightPart);
        //Возвращаем итоговой результат объединив части
        return merge(leftPart, rightPart);
    }

    public static int[] merge(int[] leftPart, int[] rightPart) {
        int i = 0; // индекс для левой части массива
        int j = 0; // индекс для правой части массива
        int k = 0; // индекс для объединненного массива
        int[] merged = new int[leftPart.length + rightPart.length];
        //сравниванием элементы левой и правой части и заливаем больший в результирующий массив объединяем
        while (i < leftPart.length && j < rightPart.length) {
            if (leftPart[i] <= rightPart[j]) {
                merged[k] = leftPart[i];
                i++;
            } else {
                merged[k] = rightPart[j];
                j++;
            }
            k++;
        }
        //копируем остаток элементов из левой части
        while (i < leftPart.length) {
            merged[k] = leftPart[i];
            i++;
            k++;
        }
        //копируем остаток элементов из правой части
        while (j < rightPart.length) {
            merged[k] = rightPart[j];
            j++;
            k++;
        }
        return merged;
    }
}

