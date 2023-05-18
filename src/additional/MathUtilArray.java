package homework.homework3;

public class MathUtilArray {

    public static String getEvenNumbersUpTo(byte number) {
        StringBuilder sb = new StringBuilder();
        if (number>=0) {
            sb.append(1);
            if (number>1) {
                int i = 2;
                while (i < number) {
                    if (i % 2 == 0) {
                        sb.append(i);
                    }
                    i++;
                }
                sb.append(number);
            }
        }
        return sb.toString();
    }

    private MathUtilArray() {

    }

    public static void main(String[] args) {
        System.out.println("Если передать число 5, то метод должен вернуть строку 1245 - " + MathUtilArray.getEvenNumbersUpTo((byte) 21));
    }
}
