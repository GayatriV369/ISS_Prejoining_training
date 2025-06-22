package Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000);
        System.out.println("Initial balance: $" + account.getBalance());

        account.deposit(500);
        System.out.println("Current balance: $" + account.getBalance());
    }
}