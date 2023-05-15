package homework.homework6;

public class Account {
    private int accountId;
    private int countOfMoney;
    private Client client;

    public Account(Client client, int accountId, int countOfMoney) {
        this.client = client;
        this.accountId = accountId;
        this.countOfMoney = countOfMoney;
    }

    public void changeCountOfMoney (int count, String assign) {

    }
}
