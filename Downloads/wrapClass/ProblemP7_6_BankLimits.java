public class ProblemP7_6_BankLimits {

    public static double getEffectiveLimit(Double limitFromDatabase) {
        if (limitFromDatabase == null) {
            return 0.0;
        }
        
        return limitFromDatabase;
    }

    public static void main(String[] args) {
        Double activeLimit = 1500.75;
        Double nullLimit = null;
        
        System.out.println("Active Limit: " + getEffectiveLimit(activeLimit));
        System.out.println("Null Limit: " + getEffectiveLimit(nullLimit));
    }
}