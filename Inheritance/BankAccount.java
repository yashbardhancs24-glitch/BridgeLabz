class BankAccount {
    protected long accountNumber;
    protected double balance;
    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(long accNum, double bal, double rate) {
        super(accNum, bal);
        this.interestRate = rate;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account (Interest Rate: " + interestRate + "%)");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(long accNum, double bal, double limit) {
        super(accNum, bal);
        this.withdrawalLimit = limit;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account (Withdrawal Limit: $" + withdrawalLimit + ")");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount(12345, 5000, 2.5);
        CheckingAccount myChecking = new CheckingAccount(67890, 1500, 500);
        mySavings.displayAccountType();
        myChecking.displayAccountType();
    }
}