package homework.homework3;

public class ConditionalUtilsLeapYear {
    public static boolean isLeapYear(int inputYear) {
        if (inputYear % 4 == 0) {
            if (inputYear % 100 == 0) {
                return inputYear % 400 == 0;
            }
            return true;
        }
        return false;
    }

    private ConditionalUtilsLeapYear() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 2004, метод должен вернуть true - " + ConditionalUtilsLeapYear.isLeapYear(1700));
    }
}