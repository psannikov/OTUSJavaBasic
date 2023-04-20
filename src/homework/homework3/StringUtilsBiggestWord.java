package homework.homework3;

public class StringUtilsBiggestWord {
    public static String getLargest(String input) {
        String[] inputArray = input.split(" ");
        int lengthOfLargest = 0;
        int indexOfLargest = 0;
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i].replaceAll("[^а-яА-Яa-zA-Z]", "");
            if (inputArray[i].length() >= lengthOfLargest) {
                lengthOfLargest = inputArray[i].length();
                indexOfLargest = i;
            }
        }
        return inputArray[indexOfLargest];
    }

    private StringUtilsBiggestWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"с1111амое большое слово\" метод должен вернуть \"большое\" - "
                + StringUtilsBiggestWord.getLargest("с1111амое большое слово"));
    }
}