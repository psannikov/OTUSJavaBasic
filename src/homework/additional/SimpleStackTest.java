package homework.additional;
/*Реализуйте класс стека, который работает с целочисленными значениями.*/
import java.util.LinkedList;

public class SimpleStackTest {
    private SimpleStackTest(){}

    public static void main(String[] args) {
        Stack<Integer> stack = new SimpleStack();
        System.out.println("Вначале стек пуст: " + stack.isEmpty());
        System.out.println("Помещаем в стек 42: " + stack.push(42));
        System.out.println("После добавления элемента - не пуст: " + stack.isEmpty());
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
    private LinkedList<Integer> stack;

    public SimpleStack() {
        stack = new LinkedList<>();
    }

    @Override
    public Integer push(Integer item) {
        stack.push(item);
        return item;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return stack.pop();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}