package homework.homework6;

import java.util.Set;

public class Client {
    private int userId;
    private String name;
    private byte age;
    private Set<Account> clientAccounts;

    public Set<Account> getClientAccounts () {
        return clientAccounts;
    }
    public void addClientAccount (Account account) {
        this.clientAccounts.add(account);
    }
    public Client(int userId, String name, byte age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}
