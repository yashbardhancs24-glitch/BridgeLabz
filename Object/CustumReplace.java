public class CustomReplace {

    public static String replace(String source, char oldChar, char newChar) {
        if (source == null) {
            return null;
        }

        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog.";
        char toReplace = 'o';
        char replaceWith = 'x';

        System.out.println("Original: " + text);
        String modifiedText = replace(text, toReplace, replaceWith);
        System.out.println("Modified: " + modifiedText);
    }
}package day7;

public class CustumReplace {
}
