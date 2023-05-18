package homework.homework3;

public class MathUtilAvg {
    public static int getPrimeNumbersSum(byte lowEdge, byte highEdge) {
        int resSum = 0;
        int resCount = 0;
        if ((lowEdge >= 0 && highEdge > 0) && (lowEdge < highEdge)) {
            System.out.println("popal");
            for (int i = lowEdge; i <= highEdge; i++) {
                if (i % 2 == 0) {
                    resSum += i;
                    resCount++;
                }
            }
        } else {
            return 0;
        }
        return resSum / resCount;
    }

    private MathUtilAvg() {

    }

    public static void main(String[] args) {
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) -100, (byte) 10));
    }

}