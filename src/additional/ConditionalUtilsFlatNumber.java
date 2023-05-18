package homework.homework3;

public class ConditionalUtilsFlatNumber {
    public static boolean isDescendingNumber(int inputNumber) {
        boolean res = false;
        if ((inputNumber >= 100) && (inputNumber <= 999)) {
            String[] numbs = String.valueOf(inputNumber).split("");
            if (numbs[0].equals(numbs[1]) && numbs[0].equals(numbs[2])) {
             res = true;
            }
        }
        return res;
    }

    private ConditionalUtilsFlatNumber() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 777 метод должен вернуть true - " + ConditionalUtilsFlatNumber.isDescendingNumber(777));
    }
}