package homework.homework8.test;

import homework.homework8.test.unit.DiceImplTest;
import homework.homework8.test.unit.GameTest;

public class AllTest {
    public static void main(String[] args) {
        /*Первая ошибка игры - outOfRange для костей
        метод Random.nextInt() дает любой инт в том числе
        за пределами 1-6
         */
        new DiceImplTest().testDiceOutOfRangeOver6();
        new DiceImplTest().testDiceOutOfRangeLower1();
        new GameTest().testGameEqualsPlayers();
        /*Вторая ошибка игры - если будут выброшены одинаковые значения
        игра возвращает победителем второго человека, должна быть ничья
        по моей логике должна быть выбрашена ошибка
         */
        new GameTest().testGamePlayGame();
        new GameTest().testGameEqualsDiceRoll();

    }
}
