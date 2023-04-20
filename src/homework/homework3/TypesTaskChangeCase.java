package homework.homework3;

public class TypesTaskChangeCase {
    public static char changeCase(char input) {
        if (Character.isLetter(input)) {
            if (String.valueOf(input).equals(String.valueOf(input).toLowerCase())) {
                input = String.valueOf(input).toUpperCase().toCharArray()[0];
            } else {
                input = String.valueOf(input).toLowerCase().toCharArray()[0];
            }
        }
        return input;
    }

    private TypesTaskChangeCase() {

    }

    public static void main(String[] args) {
        System.out.println(
                "Ввод G в верхнем регистре, должны получить в нижнем: " +
                        changeCase('G')
        );
        System.out.println(
                "Ввод g в нижнем регистре, должны получить в верхнем: " +
                        changeCase('-')
        );
    }
}
