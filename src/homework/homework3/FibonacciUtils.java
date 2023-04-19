package homework.homework3;

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {
        int i1 = 1;
        int i2 = 1;
        int f = 0;
        for (byte i=3; i<=limit; i++){
            f = i1 + i2;
            i1 = i2;
            i2 = f;
        }
        return String.valueOf((f - 1) + (f - 2));
    }

    private FibonacciUtils(){

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
    }
}
