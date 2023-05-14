package homework.homework3;

public class TypesTaskSumN {
    public static long sumN(int input) {
        int res=0;
        if (input >= 1) {
            for (int i = 1; i <= input; i ++) {
                res += i;
            }
        }
        return res;
    }

    private TypesTaskSumN() {

    }

    public static void main(String[] args) {
        System.out.println(
                "Ввод меньше 1 должен вернуть 0: " +
                        sumN(-1)
        );
        System.out.println(
                "Сумма от 1 до 7: " +
                        sumN(7)
        );
    }
}
