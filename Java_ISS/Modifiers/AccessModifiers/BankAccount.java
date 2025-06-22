package Modifiers.AccessModifiers;

/**
 * Demonstrates access modifiers with a simple 'BankAccount' example
 */
public class BankAccount {

    public String accountHolder;   // Accessible everywhere
    private double balance;        // Accessible only within this class
    protected String accountType;  // Accessible within package and subclasses
    String creationDate;          // Accessible within the same package

    public BankAccount(String accountHolder, double initialBalance, String accountType, String creationDate) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.creationDate = creationDate;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }

    // Private method to check balance (only accessible within this class)
    private double getBalance() {
        return balance;
    }

    // Protected method to display account type (accessible within package and subclasses)
    protected void displayAccountType() {
        System.out.println("Account Type: " + accountType);
    }

    // Default (package-private) method to display creation date
    void displayCreationDate() {
        System.out.println("Creation Date: " + creationDate);
    }

    // Public method to show account details
    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance()); // Accessing private method
        displayAccountType(); // Accessing protected method
        displayCreationDate(); // Accessing default method
    }
}