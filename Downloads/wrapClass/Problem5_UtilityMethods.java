public class Problem5_UtilityMethods {
    public static void main(String[] args) {
        String strInt = "123";
        int parsedInt = Integer.parseInt(strInt);
        System.out.println("Integer.parseInt(\"123\") = " + parsedInt);
        
        String strDouble = "3.14";
        double parsedDouble = Double.parseDouble(strDouble);
        System.out.println("Double.parseDouble(\"3.14\") = " + parsedDouble);
        
        String strBoolean = "true";
        boolean parsedBoolean = Boolean.parseBoolean(strBoolean);
        System.out.println("Boolean.parseBoolean(\"true\") = " + parsedBoolean);
        
        int numToBinary = 10;
        String binaryString = Integer.toBinaryString(numToBinary);
        System.out.println("Integer.toBinaryString(10) = " + binaryString);
        
        char ch1 = '5';
        boolean isDigit = Character.isDigit(ch1);
        System.out.println("Character.isDigit('5') = " + isDigit);
        
        char ch2 = 'a';
        char upperChar = Character.toUpperCase(ch2);
        System.out.println("Character.toUpperCase('a') = " + upperChar);
    }
}