import java.util.ArrayList;

public class ProblemP9_9_StudentMarks {

    public static Integer parseMark(Object input) {
        if (input == null) {
            return null;
        }
        
        if (input instanceof Integer) {
            return (Integer) input;
        }
        
        if (input instanceof String) {
            String strInput = (String) input;
            
            if (strInput.equalsIgnoreCase("null")) {
                return null;
            }
            
            try {
                return Integer.parseInt(strInput);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        
        if (input instanceof Number) {
             return ((Number) input).intValue();
        }

        return null;
    }

    public static void main(String[] args) {
        Object[] allInputs = {"85", 95, Integer.valueOf(88), "null", "abc", 72, 91.5, "67"};
        
        ArrayList<Integer> validMarks = new ArrayList<>();
        int totalSum = 0;
        
        for (Object input : allInputs) {
            Integer mark = parseMark(input);
            if (mark != null) {
                validMarks.add(mark);
                totalSum += mark;
            }
        }
        
        double average = 0.0;
        if (!validMarks.isEmpty()) {
            average = (double) totalSum / validMarks.size();
        }
        
        System.out.println("All Inputs: " + java.util.Arrays.toString(allInputs));
        System.out.println("Valid Marks Processed: " + validMarks);
        System.out.println("Average of valid marks: " + average);
    }
}