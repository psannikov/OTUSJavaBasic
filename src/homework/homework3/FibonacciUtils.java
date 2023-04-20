package homework.homework3;

public class FibonacciUtils {
    public static int getFibonacciSum(byte limit) {
        if (limit <= 1) {
            return limit;
        }
        return getFibonacciSum((byte) (limit - 1)) + getFibonacciSum((byte) (limit - 2));
    }

    private FibonacciUtils(){

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
    }
}
