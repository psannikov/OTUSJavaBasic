package homework.homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static homework.homework6.ServiceFunction.printText;

public class Bank {
    private Map<Client, List<Account>> bankData = new HashMap<>();
    public List<Account> getListAccountsByClient (Client client) {
        return bankData.get(client);
    }
    public Client getClientByAccount (Account account) {
        Client clientByAccount = null;
        for (Map.Entry<Client, List<Account>> items : bankData.entrySet()) {
            if (items.getValue().contains(account))
            {
                clientByAccount = items.getKey();
            }
        }
        if (clientByAccount != null) {
            printText("Информация о клиенте найдена");
        }
        return clientByAccount;
    }
    public void addNewClient (Client client) {
        if (bankData == null) {
            printText("Клиент успешно добавлен");
            bankData.put(client, new ArrayList<>());
        } else {
            if (bankData.containsKey(client)) {
                printText("Указанный клиент уже добавлен в базу банка");
            } else {
                printText("Клиент успешно добавлен");
                bankData.put(client, new ArrayList<>());
            }
        }
    }
    public void addNewAccountToClient (Client client, Account account) {
        if (!bankData.containsKey(client)) {
            printText("Указанного клиента нет в базе банка, предварительно добавьте информацию о клиенте");
        } else {
            for (List<Account> list : bankData.values()) {
                for (Account accountInList : list) {
                    if (accountInList.equals(account)) {
                        printText("Указанный аккаунт уже добавлен в базу банка");
                        return;
                    }
                }
            }
            List<Account> listOfAccountsThisClient = bankData.getOrDefault(client, new ArrayList<>());
            listOfAccountsThisClient.add(account);
            bankData.put(client,listOfAccountsThisClient);
            printText("Аккаунт добавлен в базу банка");
        }
    }
    public void changeCountOfMoneyInAccount (Account account, int countOfMoney, String assign) {
        if (getClientByAccount(account).getAge() >= 18) {
            account.changeCountOfMoney(countOfMoney,assign);
        } else {
            printText("Ваш возраст не позволяет проводить операции с аккаунтом");
        }
    }
}
