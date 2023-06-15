package homework.homework8.test.unit.fake;

import homework.homework8.game.Dice;

public class DiceImplStub  implements Dice {
    @Override
    public int roll() {
        return 2;
    }
}
