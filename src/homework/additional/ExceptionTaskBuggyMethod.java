package homework.additional;
/* Дан метод, который содержит скрытые ошибки в вычислениях. Необходимо доработать метод так, чтобы при возникновении
 * ошибок он продолжал работу, а результат вычисления итерации, на которой была получена ошибка, был бы равен 0.
 */
public class ExceptionTaskBuggyMethod {
    private ExceptionTaskBuggyMethod(){}

    public static int buggyMethod(Integer[] inputNumbers) {
        int result = 0;
        for (var item: inputNumbers) {
            result += (item + 1) / item;
        }
        return result;
    }

    public static void main(String[] args) {
        buggyMethod(null);
        buggyMethod(new Integer[]{1, 0});
    }
}
