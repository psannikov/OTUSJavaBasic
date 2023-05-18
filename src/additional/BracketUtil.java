package homework.homework3;

public class BracketUtil {
    public static boolean isCorrectBrackets(String input,
                                            char bracketOpenSymbol,
                                            char bracketCloseSymbol) {
        int countOpenSymbol = 0;
        int countCloseSymbol = 0;
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == bracketOpenSymbol) {
                countOpenSymbol++;
            } else if (input.charAt(i) == bracketCloseSymbol) {
                countCloseSymbol++;
            } else {
                return false;
            }
            if (countOpenSymbol<countCloseSymbol) {
                return false;
            }
        }
        return countOpenSymbol == countCloseSymbol;
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}
