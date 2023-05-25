package homework.homework6;

import java.util.Objects;

import static homework.homework6.ServiceFunction.printText;

public class Account {
    private final int accountId;
    private int countOfMoney;
    private Client client;

    public Account(Client client, int accountId, int countOfMoney) {
        this.client = client;
        this.accountId = accountId;
        this.countOfMoney = countOfMoney;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return
                Objects.equals(accountId, account.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        return "Информация о аккаунте {AccountId=" + accountId + ", количество монет=" + countOfMoney + "}";
    }

    public void changeCountOfMoney (int count, String assign) {
        switch (assign) {
            case "+" -> {printText("Изменение состояния аккаунта");
                this.countOfMoney += count;}
            case "-" -> {
                if (this.countOfMoney < count) {
                    printText("На счете недостаточно средств");
                } else {
                    printText("Изменение состояния аккаунта");
                    this.countOfMoney -= count;
                }
            }
        }

    }
}
