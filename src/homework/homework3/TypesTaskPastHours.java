package homework.homework3;

public class TypesTaskPastHours {
    private static final int SECONDS_IN_DAY = 86400;

    public static int pastHours(int second) {
        int hours = 0;
        if ((second > 0) && (second < SECONDS_IN_DAY)) {
            hours = second/3600;
        }
        return hours;
    }

    private TypesTaskPastHours(){

    }

    public static void main(String[] args) {
        System.out.println("С начала дня прошло 2 часа: " + pastHours(125 * 60));
        System.out.println("С начала дня прошло 0 часа: " + pastHours(-10));
    }
}
