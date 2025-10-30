import java.util.*;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        sc.close();
    }

    static int findGCD(int a, int b) {
        return (b == 0) ? a : findGCD(b, a % b);
    }

    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
