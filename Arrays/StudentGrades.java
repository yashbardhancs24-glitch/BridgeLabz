package Arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] perc = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " marks:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) { j--; continue; }
            }
            perc[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            if (perc[i] >= 90) grade[i] = 'A';
            else if (perc[i] >= 75) grade[i] = 'B';
            else if (perc[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " -> %: " + perc[i] + " Grade: " + grade[i]);
        }
    }
}
