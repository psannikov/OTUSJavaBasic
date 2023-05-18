package homework.homework3;

public class ConditionalUtilsTwiceEven {
    public static boolean isDoublePrime(int inputNumber) {
        if ((inputNumber >=100) && (inputNumber <=999)){
            int i1 = inputNumber/100;
            int i2 = inputNumber/10%10;
            int i3 = inputNumber%100;
            if (((i1 + i2 + i3) % 2 == 0) && ((i1 * i2 * i3) % 2 == 0)) {
                return true;
            }
        }
        return false;
    }

    private ConditionalUtilsTwiceEven() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 222 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(222));
    }
}
