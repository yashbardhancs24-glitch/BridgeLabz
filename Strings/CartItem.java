import java.util.ArrayList;
import java.util.List;

// Represents a single item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return this.itemName + " (Qty: " + this.quantity + ", Price: $" + this.price + ")";
    }
}

// Manages the collection of CartItems
public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Method to add an item
    public void addItem(CartItem item) {
        this.items.add(item);
        System.out.println(item.itemName + " added to the cart.");
    }

    // Method to remove an item by name
    public void removeItem(String itemName) {
        // Use removeIf for concise removal logic
        boolean removed = this.items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        if (removed) {
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to calculate and display the total cost
    public void displayTotalCost() {
        double totalCost = 0.0;
        System.out.println("\n---- CART SUMMARY ----");
        for (CartItem item : this.items) {
            System.out.println("- " + item);
            totalCost += item.getItemTotal();
        }
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("----------------------");
    }

    // Main method to test the classes
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Milk", 3.60, 2));
        cart.addItem(new CartItem("Bread", 2.50, 1));
        cart.addItem(new CartItem("Eggs", 4.00, 1));

        cart.displayTotalCost();

        cart.removeItem("Bread");

        cart.displayTotalCost();
    }
}