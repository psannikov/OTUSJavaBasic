package homework.additional;
/* Доработайте метод getAllElements так, чтобы в случае возникновения ошибки он в качестве результата
 * записывал в список сообщение выброшенного исключения, а также после каждой итерации в любом случае
 * добавлял бы строку ""end""
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionTaskGetAllElements {
    private static String processString(String item) {
        if(item.contains("Ю")) {
            throw new IllegalArgumentException("Обнаружена буква Ю!");
        }
        if(item.contains("Ё")) {
            throw new NullPointerException("Ё не разрешено!");
        }
        return item;
    }

    public static String[] getAllElements(String[] input) {
        var result = new ArrayList<String>(input.length);
        for (String item : input) {
//TODO
            result.add(processString(item));
        }
        return result.toArray(new String[0]);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAllElements(new String[]{"Ю", "б", "в", "Ю", "Д", "ЁЖ"})));
    }
}
