package homework.homework3;

import java.util.Locale;

public class StringUtilsPalindrome {
    public static boolean isPalindrome(String input) {
        String reversWord = "";
        input = input.replaceAll("[^а-яА-Яa-zA-Z]", "").toLowerCase();
        if (input.length() == 0){
            return false;
        }
        for (int i = input.length() - 1; i >= 0; i--){
            reversWord += input.charAt(i);
        }
        return reversWord.equals(input);
    }

    private StringUtilsPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("12!"));
    }
}
