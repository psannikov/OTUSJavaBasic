package homework.homework6;

import java.util.Objects;

public class Client {
    private final int userId;
    private String name;
    private byte age;

    public Client(int userId, String name, byte age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return
                Objects.equals(userId, client.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "Информация о клиенте {userId=" + userId + ", name=" + name + ", age=" + age + "}";
    }

    public byte getAge() {
        return age;
    }
}
