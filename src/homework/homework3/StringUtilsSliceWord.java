package homework.homework3;

public class StringUtilsSliceWord {
    public static String getSlice(String input, int leftEdge, int rightEdge) {
        if ((rightEdge <= leftEdge) ||
                (rightEdge < 0) ||
                (leftEdge < 0) ||
                (rightEdge > input.length()) ||
                (leftEdge > input.length())) {
            return input;
        }
        return input.substring(leftEdge,rightEdge);
    }

    private StringUtilsSliceWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test\" с индексами 1 и 4 метод должен вернуть \"est\" - "
                + "\"" + StringUtilsSliceWord.getSlice("Test", 2,2) +"\"");

    }
}
