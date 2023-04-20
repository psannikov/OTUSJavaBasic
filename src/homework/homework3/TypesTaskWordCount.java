package homework.homework3;

public class TypesTaskWordCount {
    public static int wordCount(String input) {

        return (input.length() == 0) ? 0 : (input.split(" ").length);
    }

    private TypesTaskWordCount() {

    }

    public static void main(String[] args) {
        System.out.println(
                "В этой строке пять слов: " +
                        wordCount("")
        );
    }
}