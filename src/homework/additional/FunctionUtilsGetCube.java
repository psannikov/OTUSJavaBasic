package homework.homework3;
import java.math.BigInteger;

public class FunctionUtilsGetCube {
    public static String getCube(int input) {
        return BigInteger.valueOf(input).pow(3).toString();

    }
    private FunctionUtilsGetCube() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 1478, метод должен вернуть 3228667352 - '"
                        + FunctionUtilsGetCube.getCube(1478)
                        + "'"
        );
    }
}
