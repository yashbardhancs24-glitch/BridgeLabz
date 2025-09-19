package Arrays;
import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';

        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];

        System.out.print("Reversed: ");
        for (int d : rev) System.out.print(d);
    }
}
