import java.util.Scanner;

public class TotalPriceCalculator {

    public static void main(String[] args) {
        Scanner dataReader = new Scanner(System.in);

        System.out.print("Enter the unit price: ");
        double unitPrice = dataReader.nextDouble();

        System.out.print("Enter the quantity: ");
        int purchasedQuantity = dataReader.nextInt();

        double finalPrice = unitPrice * purchasedQuantity;

        System.out.println("The total purchase price is INR " + finalPrice + " if the quantity " + purchasedQuantity + " and unit price is INR " + unitPrice + ".");

        dataReader.close();
    }
}