import java.util.Scanner;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId; this.name = name; this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
    public void display() { System.out.printf("%s (%s) - Price: %.2f%n", name, productId, price); }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.05; }
    @Override public double calculateTax() { return getPrice() * 0.18; }
    @Override public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return 100; }
    @Override public double calculateTax() { return getPrice() * 0.12; }
    @Override public String getTaxDetails() { return "GST 12%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return 0; }
}

public class ECommerce {
    public static void printFinalPrice(Product p) {
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;
        p.display();
        System.out.printf("Tax: %.2f, Discount: %.2f, Final: %.2f%n", tax, discount, finalPrice);
        if (p instanceof Taxable) System.out.println(((Taxable)p).getTaxDetails());
        System.out.println();
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Electronics("E100", "Smartphone", 20000),
                new Clothing("C200", "Jeans", 1500),
                new Groceries("G300", "Rice 5kg", 400)
        );
        for (Product p : products) printFinalPrice(p);
    }
}
