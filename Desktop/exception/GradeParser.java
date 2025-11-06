import java.util.List;

public class GradeParser {
    public static void main(String[] args) {
        List<String> grades = List.of("90", "A+", "85", "77", "F-");

        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade);
                System.out.println("Parsed grade: " + numericGrade);
            } catch (NumberFormatException e) {
                System.err.println("Invalid grade input: " + grade);
            }
        }
    }
}