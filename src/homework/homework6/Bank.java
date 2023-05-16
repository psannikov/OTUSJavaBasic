package homework.homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<Client, List<Account>> bankData = new HashMap<>();
    public List<Account> getListAccountsByClient (Client client) {
        return bankData.get(client);
    }
    public Client getClientByAccount (Account account) {
        Client clientByAccount = null;
        for (Map.Entry<Client, List<Account>> items : bankData.entrySet()) {
            for (Account accountInList: items.getValue()) {
                if (accountInList.equals(account)) {
                    System.out.println("Информация о клиенте найдена");
                    clientByAccount = items.getKey();
                } else {
                    System.out.println("Информация о клиенте не найдена");
                }
            }
        }
        return clientByAccount;
    }
    public void addNewClient (Client client) {
        if (bankData == null) {
            System.out.println("Клиент успешно добавлен");
            bankData.put(client, new ArrayList<Account>());
        } else {
            if (bankData.containsKey(client)) {
                System.out.println("Указанный клиент уже добавлен в базу банка");
            } else {
                System.out.println("Клиент успешно добавлен");
                bankData.put(client, new ArrayList<Account>());
            }
        }
    }
    public void addNewAccountToClient (Client client, Account account) {
        if (!bankData.containsKey(client)) {
            System.out.println("Указанного клиента нет в базе банка, предварительно добавьте информацию о клиенте");
        } else {
            for (List<Account> list : bankData.values()) {
                for (Account accountInList : list) {
                    if (accountInList.equals(account)) {
                        System.out.println("Указанный аккаунт уже добавлен в базу банка");
                        return;
                    }
                }
            }
            List<Account> listOfAccountsThisClient = bankData.getOrDefault(client, new ArrayList<Account>());
            listOfAccountsThisClient.add(account);
            bankData.put(client,listOfAccountsThisClient);
        }
    }
}
