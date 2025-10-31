import java.util.Scanner;

public class Problem8_CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        int totalLetters = 0;
        int totalDigits = 0;
        int totalSpecial = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                totalLetters++;
            } else if (Character.isDigit(ch)) {
                totalDigits++;
            } else if (!Character.isWhitespace(ch)) {
                totalSpecial++;
            }
        }
        
        System.out.println("Total letters: " + totalLetters);
        System.out.println("Total digits: " + totalDigits);
        System.out.println("Total special characters: " + totalSpecial);
        
        scanner.close();
    }
}