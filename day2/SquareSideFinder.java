import java.util.Scanner;

public class SquareSideFinder {

    public static void main(String[] args) {
        Scanner myReader = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeterVal = myReader.nextDouble();

        double sideLength = perimeterVal / 4;

        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeterVal + ".");

        myReader.close();
    }
}
