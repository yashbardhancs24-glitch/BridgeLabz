public class ProblemP5_1_ShoppingCart {
    public static void main(String[] args) {
        String[] itemPrices = {"250", "499", "abc", "99"};
        
        int totalPrice = 0;
        
        System.out.println("Processing cart...");
        for (String priceStr : itemPrices) {
            try {
                int price = Integer.parseInt(priceStr);
                totalPrice += price;
                System.out.println("Added: " + price);
            } catch (NumberFormatException e) {
                System.out.println("Skipped invalid item (price: \"" + priceStr + "\")");
            }
        }
        
        System.out.println("Total Price: " + totalPrice);
    }
}