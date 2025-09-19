import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String s1, String s2) {
        String cleanS1 = s1.replaceAll("\\s", "").toLowerCase();
        String cleanS2 = s2.replaceAll("\\s", "").toLowerCase();

        if (cleanS1.length() != cleanS2.length()) {
            return false;
        }

        char[] arr1 = cleanS1.toCharArray();
        char[] arr2 = cleanS2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams: " + areAnagrams(str1, str2));

        String str3 = "Hello";
        String str4 = "World";
        System.out.println("'" + str3 + "' and '" + str4 + "' are anagrams: " + areAnagrams(str3, str4));
    }
}