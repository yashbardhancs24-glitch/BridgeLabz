class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class OrderProcessor {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        int failureType = (int) (Math.random() * 3);

        if (failureType == 1) {
            throw new OutOfStockException("Product is currently out of stock. Check back later.");
        } else if (failureType == 2) {
            throw new PaymentFailedException("Payment gateway timed out. Please try a different method.");
        } else {
            System.out.println("Order placed successfully!");
        }
    }
}

public class OrderProcessingSimulation {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        try {
            processor.placeOrder();
        } catch (OutOfStockException e) {
            System.err.println("Order Error (Inventory): " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.err.println("Order Error (Payment): " + e.getMessage());
        }
    }
}