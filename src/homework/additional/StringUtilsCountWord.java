package homework.homework3;

public class StringUtilsCountWord {
    public static int countWord(String input, String word) {
        int cnt = 0;
        boolean cicle = true;
        while (cicle) {
            if (input.toLowerCase().equals(input.toLowerCase().replaceFirst(word.toLowerCase(),""))) {
                cicle = false;
            } else {
                input = input.toLowerCase().replaceFirst(word.toLowerCase(),"");
                cnt++;
            }
        }
        return cnt;
    }

    private StringUtilsCountWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test string for test\" и искомом слове \"test\" метод должен вернуть 2 - "
                + StringUtilsCountWord.countWord("Test string for teStTest", "rergdg"));
    }
}
