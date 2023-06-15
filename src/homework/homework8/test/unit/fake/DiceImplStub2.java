package homework.homework8.test.unit.fake;

import homework.homework8.game.Dice;

public class DiceImplStub2  implements Dice {
    private int res = 1;
    @Override
    public int roll() {
        return res++;
    }
}
