package homework.additional;
/*Реализуйте метод, который заменяет все нулевые биты переданного числа на 1
и возвращает получившееся десятиричное число.*/
public class FunctionUtilsShiftZeroes {
    public static int shiftZeroes(int input) {
        return Integer.parseInt(Integer.toBinaryString(input).replace("0","1"),2);
    }
    private FunctionUtilsShiftZeroes() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 3435, метод должен вернуть 4095 - '"
                        + FunctionUtilsShiftZeroes.shiftZeroes(3435)
                        + "'"
        );
    }
}