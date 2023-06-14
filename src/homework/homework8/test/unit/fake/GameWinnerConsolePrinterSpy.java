package homework.homework8.test.unit.fake;

import homework.homework8.game.GameWinnerPrinter;
import homework.homework8.game.Player;

import java.util.List;

public class GameWinnerConsolePrinterSpy implements GameWinnerPrinter {
    private final List<String> actualFlow;

    public GameWinnerConsolePrinterSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;

    }

    @Override
    public void printWinner(Player winner) {
        System.out.printf("Победитель: %s%n", winner.getName());
        actualFlow.add(winner.getName());
    }
}
