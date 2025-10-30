package Interface;

interface SensitiveData {} // Marker Interface

class CustomerInfo implements SensitiveData {
    String name = "John";
    String creditCard = "****-****-****-1234";
}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        CustomerInfo info = new CustomerInfo();

        System.out.println("Encrypting sensitive data...");
    }
}
