package homework.homework3;

public class WordUtils {
    public static String reverseWords(String inputText) {
        String[] arraySource = inputText.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i=arraySource.length-1;i>=0;i--) {
            sb.append(arraySource[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("¬вод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("¬вод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("¬вод двух слов - " + WordUtils.reverseWords("два слова"));
    }
}
