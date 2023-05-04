package homework.additional;
/*Реализуйте метод, который из переданного шестнадцатеричного числа возвращает двоичное.*/
public class FunctionUtilsHexToBin {
    public static String hexToBin(String hexBase) {
        //TODO
        return "010";
    }
    private FunctionUtilsHexToBin() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 17, метод должен вернуть 10111 - '"
                        + FunctionUtilsHexToBin.hexToBin("17")
                        + "'"
        );
    }
}