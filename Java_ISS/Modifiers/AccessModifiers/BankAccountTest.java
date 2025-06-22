package Modifiers.AccessModifiers;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0, "Savings", "2024-01-01");

        // Accessing public fields and methods
        System.out.println("Account Holder: " + account.accountHolder);
        account.deposit(500.0);

        // The following lines would cause errors due to access restrictions:
        // System.out.println("Balance: " + account.balance); // ERROR: private
        // account.getBalance(); // ERROR: private
        // account.displayAccountType(); // OK: protected (same package)
        // account.displayCreationDate(); // OK: default (same package)

        account.showAccountDetails(); // Accessing all details through public method
    }
}