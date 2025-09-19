public class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all details
    public void displayPhoneDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: $" + this.price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("Samsung", "Galaxy S25", 999.99);
        myPhone.displayPhoneDetails();
    }
}