import java.util.*;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = input("Enter first number: ", sc);
        int b = input("Enter second number: ", sc);
        int c = input("Enter third number: ", sc);

        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
        sc.close();
    }

    static int input(String message, Scanner sc) {
        System.out.print(message);
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
