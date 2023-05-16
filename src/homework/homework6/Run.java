package homework.homework6;

import static homework.homework6.ServiceFunction.printText;

public class Run {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //Создаем данные для работы
        Client client1 = new Client(1, "Иван", (byte) 20);
        Client client2 = new Client(2, "Петя", (byte) 10);
        Client client3 = new Client(3, "Ваня", (byte) 50);
        Account account1 = new Account(client1, 1, 30);
        Account account2 = new Account(client1, 2, 10);
        Account account3 = new Account(client1, 3, 100);
        Account account4 = new Account(client2, 4, 1);
        Account account5 = new Account(client2, 1, 1);
        Account account6 = new Account(client3, 5, 11);
        Account account7 = new Account(new Client(4, "Коля", (byte) 20), 1, 1);
        //Тесты по добавлению данных по клиентам и аккаунтам
        printText("=".repeat(30));
        printText("Блок создания данных о клиентах и аккаунтах");
        printText("=".repeat(30));
        printText("Создаем корректные данные");
        printText("Добавляем нового клиента");
        bank.addNewClient(client1);
        printText("Добавляем 2го клиента");
        bank.addNewClient(client2);
        printText("Добавляем информацию по аккаунту 1 для 1го клиента");
        bank.addNewAccountToClient(client1,account1);
        printText("Добавляем информацию по аккаунту 2 и 3 для 1го клиента");
        bank.addNewAccountToClient(client1,account2);
        bank.addNewAccountToClient(client1,account3);
        printText("Добавляем информацию по аккаунту 4 для 2го клиента");
        bank.addNewAccountToClient(client2,account4);
        printText("=".repeat(30));
        printText("Попытки создания некорректных данных");
        printText("Попытка добавить клиента повторно");
        bank.addNewClient(client1);
        printText("Пытаемся повторно добавить информацию по аккаунту 1 для 1го клиента");
        bank.addNewAccountToClient(client1,account1);
        printText("Пытаемся повторно добавить информацию по аккаунту 1 для 2го клиента передав туда ссылку на объект1");
        bank.addNewAccountToClient(client2,account1);
        printText("Пытаемся повторно добавить информацию по аккаунту 1 для 2го клиента передав туда ссылку на объект5 сверка идентичности переопределена в equals по значению accountId");
        bank.addNewAccountToClient(client2,account5);
        printText("Пытаемся добавить информацию по аккаунту 6 и клиенту 3 без добавления инфомрации о клиенте 3");
        bank.addNewAccountToClient(client3,account6);
        printText("Пытаемся добавить информацию по аккаунту 7 и клиенту создавая его в момент инициализации");
        bank.addNewAccountToClient(new Client(5, "Саша", (byte) 40),account7);
        //Тесты получения данных
        printText("=".repeat(30));
        printText("Блок получения данных");
        printText("=".repeat(30));
        printText("Получение списка аккаунтов по переданому клиенту");
        printText(bank.getListAccountsByClient(client1).toString());
        printText("=".repeat(30));
        printText("Получение клиента по аккаунту");
        printText(bank.getClientByAccount(account1).toString());
        //Тесты изменения данных
        printText("=".repeat(30));
        printText("Блок операций по счету");
        printText("=".repeat(30));
        printText("Успешное изменение состояния счета");
        printText("Состояние до изменения");
        printText(account1.toString());
        printText("Добавление 15 монет");
        bank.changeCountOfMoneyInAccount(account1,15,"+");
        printText("Состояние после изменения");
        printText(account1.toString());
        printText("Убавление 27 монет");
        bank.changeCountOfMoneyInAccount(account1,27,"-");
        printText("Состояние после изменения");
        printText(account1.toString());
        printText("=".repeat(30));
        printText("Неуспешное изменение состояния счета");
        printText("Состояние до изменения");
        printText(account4.toString());
        printText("Добавление 15 монет");
        bank.changeCountOfMoneyInAccount(account4,15,"+");
        printText("Состояние после изменения");
        printText(account4.toString());
        printText("Убавление 50 монет");
        printText("Состояние до изменения");
        printText(account2.toString());
        bank.changeCountOfMoneyInAccount(account2,27,"-");
        printText("Состояние после изменения");
        printText(account2.toString());
    }
}
