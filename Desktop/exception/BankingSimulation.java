class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) { super(message); }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) { super(message); }
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) { super(message); }
}

class Transaction {
    public void execute() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int failure = (int) (Math.random() * 4);

        if (failure == 1) {
            throw new NegativeAmountException("Error: Transaction amount cannot be negative.");
        } else if (failure == 2) {
            throw new InsufficientFundsException("Error: Your account balance is too low for this transaction.");
        } else if (failure == 3) {
            throw new NetworkFailureException("Error: Network connection lost during processing.");
        } else {
            System.out.println("Transaction completed successfully.");
        }
    }
}

public class BankingSimulation {
    public static void main(String[] args) {
        Transaction tx = new Transaction();

        try {
            tx.execute();
        } catch (NegativeAmountException e) {
            System.err.println("Transaction Failed (Amount Issue): " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println("Transaction Failed (Balance Issue): " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.err.println("Transaction Failed (Technical Issue): " + e.getMessage());
        }
    }
}