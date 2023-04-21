package homework.homework3;

import java.math.BigInteger;

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {
        BigInteger res = new BigInteger("0");
        if (limit > 1) {
            res = res.add(new BigInteger("1"));
            BigInteger n0 = new BigInteger("0");
            BigInteger n1 = new BigInteger("1");
            BigInteger n2;
            for (int i = 3; i <= limit; i++) {
                n2 = n0.add(n1);
                res = res.add(new BigInteger(String.valueOf(n2)));
                n0 = n1;
                n1 = n2;
            }
        }
        return res.toString();
    }

    private FibonacciUtils(){

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 100));
    }
}
