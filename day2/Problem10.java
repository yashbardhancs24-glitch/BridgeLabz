import java.util.Scanner;


public class Problem10 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCm = myScanner.nextDouble();

        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        double totalInches = heightInCm / cmPerInch;

        int feetHeight = (int) (totalInches / inchesPerFoot);

        double remainingInches = totalInches % inchesPerFoot;

        System.out.printf("Your Height in cm is %.2f, while in feet is %d and inches is %.2f.\n",
                heightInCm, feetHeight, remainingInches);

        myScanner.close();
    }
}
