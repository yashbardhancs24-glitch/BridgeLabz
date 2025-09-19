import java.util.*;

class BMI {
    public static void calculate(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            double w = arr[i][0], h = arr[i][1] / 100.0;
            arr[i][2] = w / (h * h);
        }
    }
    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] team = new double[10][3];
        for (int i = 0; i < 10; i++) {
            team[i][0] = sc.nextDouble();
            team[i][1] = sc.nextDouble();
        }
        BMI.calculate(team);
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + team[i][0] + " Height: " + team[i][1] +
                    " BMI: " + team[i][2] + " Status: " + BMI.status(team[i][2]));
        }
    }
}
