import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        Scanner inputGetter = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = inputGetter.nextDouble();

        double feetInOneYard = 3.0;
        double yardsInOneMile = 1760.0;
        
        double distanceInYards = distanceInFeet / feetInOneYard;
        double distanceInMiles = distanceInYards / yardsInOneMile;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles + ".");

        inputGetter.close();
    }
}