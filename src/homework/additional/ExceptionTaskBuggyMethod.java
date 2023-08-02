package homework.additional;
public class ExceptionTaskBuggyMethod {

    private ExceptionTaskBuggyMethod() {}

    public static int buggyMethod(Integer[] inputNumbers) {
        int result = 0;
        if (inputNumbers == null) {
            return 0;
        }

        for (var item : inputNumbers) {
            try {
                result += (item + 1) / item;
            } catch (Exception e) {
                result += 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(buggyMethod(null)); // Output: 0
        System.out.println(buggyMethod(new Integer[]{1, 0})); // Output: 0
    }
}



