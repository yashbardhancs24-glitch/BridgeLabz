class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private int balance = 10000;

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient Funds. Available balance is ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance is ₹" + balance);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        ATM atm = new ATM();
        int withdrawalAmount = 12000;

        try {
            atm.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
        }
    }
}