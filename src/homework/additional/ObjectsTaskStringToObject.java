package homework.additional;

/*Реализуйте метод, который получает на вход строку и объект любого типа и затем приводит строку к такому же типу
и возвращает получившийся объект. Если у класса переданного объекта нет конструктора,
который принимает строковую переменную - вернуть null*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ObjectsTaskStringToObject {
    private ObjectsTaskStringToObject(){}

    public static <T> T makeObjectFromString(String input, T anyObject) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor constructor = anyObject.getClass().getConstructor();
        return (T) constructor.newInstance(input);
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Создаем число из строки: " + makeObjectFromString("15", 1));
        System.out.println("Создаем булево из строки: " + makeObjectFromString("true", true));
        System.out.println("Создаем список из строки, должно не получиться: " + makeObjectFromString("1,2,3", new ArrayList<>()));
    }
}
