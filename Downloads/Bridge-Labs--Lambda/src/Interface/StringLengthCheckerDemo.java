package Interface;

import java.util.function.Function;

public class StringLengthCheckerDemo {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        String message = "Java is powerful!";
        int len = lengthFunction.apply(message);

        System.out.println("Message length: " + len);
        System.out.println(len > 20 ? "Too Long!" : "Within Limit.");
    }
}
