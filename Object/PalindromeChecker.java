public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "Hello World";

        System.out.println("'" + str1 + "' is a palindrome: " + isPalindrome(str1));
        System.out.println("'" + str2 + "' is a palindrome: " + isPalindrome(str2));
    }
}