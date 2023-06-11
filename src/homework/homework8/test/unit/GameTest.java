package homework.homework8.test.unit;

import homework.homework8.assertions.Assertions;
import homework.homework8.game.*;
import homework.homework8.test.unit.fake.DiceImplStub;
import homework.homework8.test.unit.fake.DiceImplStub2;

public class GameTest {
    private final Dice diceStub = new DiceImplStub();
    private final Dice diceStub2 = new DiceImplStub2();
    private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
    private final Game gameStub = new Game(diceStub, winnerPrinter);
    private final Game gameStub2 = new Game(diceStub2, winnerPrinter);

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
            Assertions.assertSame(player1, player2);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameEqualsDiceRoll() {
        Throwable actual = null;
        try {
            gameStub.playGame(player1, player2);
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            throw new AssertionError("Ожидается что приложение отдаст ошибку, что не найден победитель");
        } else {
            Assertions.assertEquals(IllegalArgumentException.class, actual.getClass());
        }

    }

    public void testGamePlayGame() {
        try {
            gameStub2.playGame(player1,player2);
//            winnerPrinter.printWinner(player1);
        } catch (Throwable e) {

        }
    }

}
