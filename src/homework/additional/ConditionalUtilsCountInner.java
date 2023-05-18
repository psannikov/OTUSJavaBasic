package homework.homework3;

public class ConditionalUtilsCountInner {

    public static int countInnerNumber(int base, int checkNumber) {
        String[] array = String.valueOf(base).split("");
        int res = 0;
        for (int i = 0; i < array.length-1; i++) {
            if ((array[i]+array[i+1]).equals(String.valueOf(checkNumber))) {
                res++;
            }
        }
        return res;
    }

    private ConditionalUtilsCountInner() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе чисел 6522 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(7221, 22));
    }
}
