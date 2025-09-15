import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the student fee (INR): ");
        double initialFee = keyboardInput.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercentage = keyboardInput.nextDouble();
        
        double discountAmount = initialFee * (discountPercentage / 100);

        double finalFee = initialFee - discountAmount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f.\n",
                discountAmount, finalFee);

        keyboardInput.close();
    }
}
