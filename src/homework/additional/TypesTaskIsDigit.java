package homework.homework3;

public class TypesTaskIsDigit {
    public static boolean isDigit(char input) {
        return Character.isDigit(input);
    }
    private TypesTaskIsDigit() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе символа \"=\" метод должен вернуть false - '"
                        + TypesTaskIsDigit.isDigit('=')
                        + "'"
        );
    }
}