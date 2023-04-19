package homework.homework3;

public class StringUtilsCountWord {
    public static int countWord(String input, String word) {
        return input.toLowerCase().split(word.toLowerCase()).length;
    }

    private StringUtilsCountWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test string for test\" и искомом слове \"test\" метод должен вернуть 2 - "
                + StringUtilsCountWord.countWord("Test string for teSTTEST", "tEst"));
    }
}
