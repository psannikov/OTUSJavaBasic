package homework.additional;
/*Реализуйте класс итератора одномерного массива.*/
import java.util.Iterator;
import java.util.NoSuchElementException;

public class OneDimensionalTask {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
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
        //TODO
        return false;
    }

    @Override
    public T next() throws NoSuchElementException {
        //TODO
        return null;
    }

}