import java.util.Scanner;


public class Problem8 {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");

        double inputKilometers = inputReader.nextDouble();
        
        double conversionFactor = 1.6;

        double outputMiles = inputKilometers / conversionFactor;

        System.out.println("The total miles is " + outputMiles + " for the given " + inputKilometers + " km.");

        inputReader.close();
    }
}