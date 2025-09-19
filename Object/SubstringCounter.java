public class SubstringCounter {

    public static int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "javajavajavajavajava";
        String substring = "java";
        System.out.println("Text: " + text);
        System.out.println("Substring: " + substring);
        System.out.println("Occurrences: " + countOccurrences(text, substring));
    }
}