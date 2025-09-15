import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double aNumber = myInput.nextDouble();
        
        System.out.print("Enter second number: ");
        double anotherNumber = myInput.nextDouble();

        double sum = aNumber + anotherNumber;
        double difference = aNumber - anotherNumber;
        double product = aNumber * anotherNumber;
        double quotient = aNumber / anotherNumber;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + aNumber + " and " + anotherNumber + " is " + sum + ", " + difference + ", " + product + ", and " + quotient + " respectively.");

        myInput.close();
    }
}