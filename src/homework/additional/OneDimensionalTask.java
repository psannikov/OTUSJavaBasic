package homework.additional;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OneDimensionalTask {

    public static void main(String[] args) {
        Integer[] intArray = {};
        OneDimensionalArrayIterator<Integer> itr = new OneDimensionalArrayIterator<>(intArray);
        System.out.print("Элементы массива: ");
        while (itr.hasNext()) {
            Integer result = itr.next();
            System.out.print(result + " ");

        }
    }
}

class OneDimensionalArrayIterator<T> implements Iterator<T> {

    private final T[] array;
    private int index = 0;

    public OneDimensionalArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() throws NoSuchElementException {
        if (array.length == 0) {
            throw new NoSuchElementException("No more elements in the array.");
        }
        T element = array[index];
        index++;
        return element;
    }
}
