package Methods;

import java.util.*;

public class StudentMarks {
    static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i=0;i<n;i++) {
            for (int j=0;j<3;j++) marks[i][j] = 10 + (int)(Math.random()*90);
        }
        return marks;
    }

    static double[][] calculate(int[][] marks) {
        double[][] res = new double[marks.length][3];
        for (int i=0;i<marks.length;i++) {
            int total = marks[i][0]+marks[i][1]+marks[i][2];
            double avg = total/3.0;
            double perc = Math.round((total/300.0*100)*100.0)/100.0;
            res[i][0]=total; res[i][1]=avg; res[i][2]=perc;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=generateMarks(n);
        double[][] res=calculate(marks);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\n");
        for(int i=0;i<n;i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", marks[i][0],marks[i][1],marks[i][2],res[i][0],res[i][1],res[i][2]);
        }
    }
}
