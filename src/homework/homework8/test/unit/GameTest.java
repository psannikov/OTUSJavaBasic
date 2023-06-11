package homework.homework8.test.unit;

import homework.homework8.assertions.Assertions;
import homework.homework8.game.*;
import homework.homework8.test.unit.fake.DiceImplStub;

public class GameTest {
    private final Dice dice = new DiceImplStub();
    private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
    private final Game game = new Game(dice, winnerPrinter);

    private final Player player1 = new Player("Вася");
    private Player player2 = new Player("Петя");

    public void testGameEqualsPlayers() {
        String scenario = "Проверка что 2 игрока это одна и та же сущность";
        try {
            /*коментирование строки ниже приведет к тому что тест будет пройден,
            если для класса Player будет реализация equals то сверку можно будет
            исправить, тк кассы не трогаем и доработки нет сверяем по toString()
             */
            player2 = player1;
            Assertions.assertNotEquals(player1.toString(), player2.toString());
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameEqualsDiceRoll() {
        Throwable actual = null;
        try {
            game.playGame(player1, player2);
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            throw new AssertionError("Given code does not throw any exception");
        } else {
            Assertions.assertEquals(IllegalArgumentException.class, actual.getClass());
        }

    }

}
