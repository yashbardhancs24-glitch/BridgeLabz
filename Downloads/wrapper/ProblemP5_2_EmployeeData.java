import java.util.ArrayList;
import java.util.Collections;

public class ProblemP5_2_EmployeeData {
    public static void main(String[] args) {
        int[] employeeAges = {45, 23, 50, 31, 28, 62};
        
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : employeeAges) {
            ageList.add(age);
        }
        
        System.out.println("Employee Ages List: " + ageList);
        
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}