import java.util.HashMap;
import java.util.Map;

public class FrequentCharFinder {

    public static char findMostFrequentChar(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "success";
        System.out.println("String: " + input);
        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");
    }
}