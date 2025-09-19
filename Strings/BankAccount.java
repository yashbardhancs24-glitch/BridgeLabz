public class BankAccount {
    // Attributes
    String accountHolder;
    long accountNumber;
    private double balance; // Encapsulated for safety

    // Constructor
    public BankAccount(String accountHolder, long accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method for depositing money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method for withdrawing money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance or invalid amount.");
        }
    }

    // Method for displaying the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.printf("Current Balance: $%.2f\n", this.balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Jane Doe", 123456789, 500.0);
        myAccount.displayBalance();
        myAccount.deposit(200.0);
        myAccount.withdraw(150.0);
        myAccount.withdraw(600.0); // This will fail
        myAccount.displayBalance();
    }
}