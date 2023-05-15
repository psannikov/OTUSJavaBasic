package homework.homework6;

public class Run {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client(1, "Иван", (byte) 20);
        Client client2 = new Client(2, "Петя", (byte) 10);
        Client client3 = new Client(3, "Ваня", (byte) 50);
        Account account1 = new Account(client1, 1, 1);
        Account account2 = new Account(client1, 2, 10);
        Account account3 = new Account(client1, 3, 100);
        Account account4 = new Account(client2, 4, 1);
        Account account5 = new Account(client2, 1, 1);
        Account account6 = new Account(client3, 5, 11);
        Account account7 = new Account(new Client(4, "Коля", (byte) 20), 1, 1);
        System.out.println("Добавляем нового клиента");
        bank.addNewClient(client1);
        System.out.println("Попытка добавить клиента повторно");
        bank.addNewClient(client1);
        System.out.println("Добавляем 2го клиента");
        bank.addNewClient(client2);
        System.out.println("Добавляем информацию по аккаунту 1 для 1го клиента");
        bank.addNewAccountToClient(client1,account1);
        System.out.println("Пытаемся повторно добавить информацию по аккаунту 1 для 1го клиента");
        bank.addNewAccountToClient(client1,account1);
        System.out.println("Пытаемся повторно добавить информацию по аккаунту 1 для 2го клиента передав туда ссылку на объект1");
        bank.addNewAccountToClient(client2,account1);
        System.out.println("Добавляем информацию по аккаунту 2 и 3 для 1го клиента");
        bank.addNewAccountToClient(client1,account2);
        bank.addNewAccountToClient(client1,account3);
        System.out.println("Добавляем информацию по аккаунту 4 для 2го клиента");
        bank.addNewAccountToClient(client2,account4);
        System.out.println("Пытаемся повторно добавить информацию по аккаунту 1 для 2го клиента передав туда ссылку на объект5 сверка идентичности переопределена в equals по значению accountId");
        bank.addNewAccountToClient(client2,account5);
        System.out.println("Пытаемся добавить информацию по аккаунту 6 и клиенту 3 без добавления инфомрации о клиенте 3");
        bank.addNewAccountToClient(client3,account6);
        System.out.println("Пытаемся добавить информацию по аккаунту 7 и клиенту создавая его в момент инициализации");
        bank.addNewAccountToClient(new Client(5, "Саша", (byte) 40),account7);
    }
}
