import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover {

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            seen.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : seen) {
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original String: " + input);
        System.out.println("After removing duplicates: " + removeDuplicates(input));
    }
}