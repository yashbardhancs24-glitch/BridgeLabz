import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner inputSource = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double triangleBase = inputSource.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double triangleHeight = inputSource.nextDouble();

        double areaInSqCm = 0.5 * triangleBase * triangleHeight;
        double conversionFactor = 2.54;
        double areaInSqIn = areaInSqCm / (conversionFactor * conversionFactor);

        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm + ".");

        inputSource.close();
    }
}