package homework.additional;

/*Реализовать классы музыкантов, которые играют на гитаре и клавишных.
Каждый класс должен возвращать по методу описания строку с именем музыканта и названием инструмента на котором играет.
Пример: John plays a keyboard. Bob plays a guitar.*/

public class Musician {
    private final String name;

    public Musician(String name) {
        this.name = name;
    }

    public String description() {
        return name + " plays anything.";
    }

    protected String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Кит Ричардс играет на гитаре: " + new GuitarPlayer("Кит Ричардс").description());
    }
}

class GuitarPlayer extends Musician {
    public GuitarPlayer(String name) {
        super(name);
    }

    @Override
    public String description() {
        return getName() + " plays a guitar";
    }
}

class KeyboardPlayer extends Musician {
    public KeyboardPlayer(String name) {
        super(name);
    }

    @Override
    public String description() {
        return getName() + " plays a keyboard";
    }
}
