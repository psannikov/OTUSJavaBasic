package homework.homework3;

public class StringUtilsCamel {
    public static String toCamelCase(String input) {
        String[] array = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            String word = array[i];
            word = word.replaceAll("[^a-zA-Z]", "");
            if (sb.length() == 0) {
                sb.append(word.toLowerCase());
            } else {
                if (word.length() > 0) {
                    sb.append(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
                }
            }
        }
        return sb.toString();
    }

    private StringUtilsCamel() {

    }

    public static void main(String[] args) {
        System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
                + StringUtilsCamel.toCamelCase("TOTO% &my camel * case string 1"));
    }
}