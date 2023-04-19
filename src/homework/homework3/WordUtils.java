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
        System.out.println("���� ������ ������ - " + WordUtils.reverseWords(""));
        System.out.println("���� ������ ����� - " + WordUtils.reverseWords("word"));
        System.out.println("���� ���� ���� - " + WordUtils.reverseWords("��� �����"));
    }
}
