package homework.homework3;

public class MathUtilFactorial {
    public static long getFactorial(byte number) {
        long fact = 1;
        if (number < 0) {
            return 0;
        } else if (number > 1) {
            for (int i = 2; i <= number; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    private MathUtilFactorial() {

    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + MathUtilFactorial.getFactorial((byte) -2));
    }
}