package homework.additional;

/*Реализуйте метод, который принимает объект и класс и проверяет,
что переданный объект принадлежит к переданному классу.*/

public class ObjectsTaskClass {
    private ObjectsTaskClass() {
    }

    public static <T> boolean isClass(Object object, Class<T> clazz) {
//TODO
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Строка это класс String: " + isClass("я строка", String.class));
        System.out.println("Число это класс String: " + isClass(42, String.class));
        System.out.println("В Java всё есть объект: " + isClass(42, Object.class));
        System.out.println("В Java всё есть объект: " + isClass("и даже строка", Object.class));
    }
}
