public class ProblemP6_3_AgeValidation {

    public static boolean isValidAdultAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] testAges = {"25", "17", "abc", "42"};
        
        for (String age : testAges) {
            System.out.println("Is \"" + age + "\" a valid adult? " + isValidAdultAge(age));
        }
    }
}