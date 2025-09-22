
class Order {
    protected int orderId;
    public Order(int orderId) { this.orderId = orderId; }
    public String getOrderStatus() { return "Processing"; }
}
class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(int orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() { return "Shipped (Tracking: " + trackingNumber + ")"; }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(int orderId, String trackingNumber, String deliveryDate) {
        super(orderId, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() { return "Delivered on " + deliveryDate; }
}

public class OrderManagementDemo {
    public static void main(String[] args) {
        Order order1 = new Order(101);
        Order order2 = new ShippedOrder(102, "TRK12345");
        Order order3 = new DeliveredOrder(103, "TRK67890", "2025-09-15");

        System.out.println("Order " + ((Order)order1).orderId + " Status: " + order1.getOrderStatus());
        System.out.println("Order " + ((ShippedOrder)order2).orderId + " Status: " + order2.getOrderStatus());
        System.out.println("Order " + ((DeliveredOrder)order3).orderId + " Status: " + order3.getOrderStatus());
    }
}