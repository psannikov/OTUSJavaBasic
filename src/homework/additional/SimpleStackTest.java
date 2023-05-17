package homework.additional;
/*Реализуйте класс стека, который работает с целочисленными значениями.*/
import java.util.ArrayList;

public class SimpleStackTest {
    private SimpleStackTest(){}

    public static void main(String[] args) {
        Stack<Integer> stack = new SimpleStack();
        System.out.println("Вначале стек пуст: " + stack.isEmpty());
        System.out.println("Помещаем в стек 42: " + stack.push(42));
        System.out.println("Помещаем в стек 42: " + stack.push(36));
        System.out.println("После добавления элемента - не пуст: " + stack.isEmpty());
        System.out.println("Достали из стека последнее значение: " + stack.pop());
        System.out.println("После удаления элемента стек снова пуст: " + stack.isEmpty());
        System.out.println("Достали из стека последнее значение: " + stack.pop());
        System.out.println("После удаления элемента стек снова пуст: " + stack.isEmpty());
    }
}
interface Stack<T> {
    T push(T item);
    T pop();
    boolean isEmpty();
}

class SimpleStack implements Stack<Integer> {
    final private ArrayList<Integer> stackArrayList = new ArrayList<>();
    @Override
    public Integer push(Integer item) {
        stackArrayList.add(item);
        return item;
    }

    @Override
    public Integer pop() {
        Integer result= stackArrayList.get(stackArrayList.size()-1);
        stackArrayList.remove(stackArrayList.size()-1);
        return result;
    }

    @Override
    public boolean isEmpty() {
        return stackArrayList.size() == 0;
    }
}