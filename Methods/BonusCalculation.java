package Methods;

import java.util.*;

public class BonusCalculation {
    static double[][] generateData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random()*90000);
            data[i][1] = 1 + (int)(Math.random()*10);
        }
        return data;
    }

    static double[][] calculateNew(double[][] data) {
        double[][] res = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double sal = data[i][0], yrs = data[i][1];
            double bonus = (yrs > 5) ? sal*0.05 : sal*0.02;
            res[i][0] = sal + bonus;
            res[i][1] = bonus;
            res[i][2] = sal;
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] data = generateData(10);
        double[][] result = calculateNew(data);
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("Old\tYears\tNew\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f\n", data[i][0], data[i][1], result[i][0], result[i][1]);
            sumOld+=data[i][0]; sumNew+=result[i][0]; sumBonus+=result[i][1];
        }
        System.out.println("Total Old: "+sumOld+" New: "+sumNew+" Bonus: "+sumBonus);
    }
}
