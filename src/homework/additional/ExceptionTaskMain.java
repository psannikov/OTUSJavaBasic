package homework.additional;

public class ExceptionTaskMain {

    public static void main(String[] args) {
        System.out.println("Этот вызов бросает нужное исключение: " +
                ExceptionTask.invokesException(IllegalArgumentException.class, () -> {
                    throw new IllegalArgumentException();
                }));
        System.out.println("Этот вызов не бросает исключение: " +
                ExceptionTask.invokesException(IllegalArgumentException.class, () -> {
                    var a = 2 * 2;
                }));
        System.out.println("Этот вызов бросает не то исключение: " +
                ExceptionTask.invokesException(IllegalArgumentException.class, () -> {
                    throw new ArrayIndexOutOfBoundsException();
                }));
    }

}

interface Callable {
    void call();
}

class ExceptionTask {
    private ExceptionTask() {
    }

    public static <T extends Throwable> boolean invokesException(Class<T> clazz, Callable callable) {
        try {
            callable.call();
        } catch (Throwable ex) {
            return clazz.isInstance(ex);
        }
        return false;
    }
}