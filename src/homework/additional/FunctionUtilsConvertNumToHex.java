package homework.additional;
/*Реализуйте метод, который возвращает шестнадцатеричное представление переданного числа.*/
public class FunctionUtilsConvertNumToHex {
    public static String convertNumToHex(int input) {
// TODO
        return "0";
    }

    private FunctionUtilsConvertNumToHex() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 8191, метод должен вернуть 1FFF - '"
                        + FunctionUtilsConvertNumToHex.convertNumToHex(8191)
                        + "'"
        );
    }
}