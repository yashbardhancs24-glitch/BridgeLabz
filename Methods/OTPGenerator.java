package Methods;

import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000);
    }

    public static boolean checkUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();

        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All Unique? " + checkUnique(otps));
    }
}
