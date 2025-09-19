package Arrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String s = sc.next();
        int[] freq = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            freq[d]++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + " -> " + freq[i]);
        }
    }
}
