public class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return this.price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + this.itemCode);
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Price per unit: $" + this.price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Item apple = new Item(901, "Apple", 0.50);
        apple.displayItemDetails();
        int quantity = 12;
        System.out.println("Total cost for " + quantity + " units: $" + apple.calculateTotalCost(quantity));
    }
}