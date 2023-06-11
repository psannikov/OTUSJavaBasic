package homework.homework8.test.unit;

import homework.homework8.assertions.Assertions;
import homework.homework8.game.DiceImpl;


public class DiceImplTest {
    private final DiceImpl dice = new DiceImpl();

    public void testDiceOutOfRangeOver6() {
        String scenario = "Тест броска больше 6";
        for (int i = 0; i < 10; i++) {
            try {
                int actual = dice.roll();
                Assertions.assertBiggerMax(6, actual);
                System.out.printf("\"%s\" passed %n", scenario);
            } catch (Throwable e) {
                System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            }
        }
    }

    public void testDiceOutOfRangeLower1() {
        String scenario = "Тест броска меньше 1";
        for (int i = 0; i < 10; i++) {
            try {
                int actual = dice.roll();
                Assertions.assertLowerMin(1, actual);

                actual = dice.roll();
                Assertions.assertLowerMin(1, actual);

                System.out.printf("\"%s\" passed %n", scenario);
            } catch (Throwable e) {
                System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            }
        }
    }
}
