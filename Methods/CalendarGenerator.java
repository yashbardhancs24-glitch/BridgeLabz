package Methods;

import java.util.*;

public class CalendarGenerator {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static int getFirstDay(int month, int year) {
        int d = 1;
        if (month < 3) { month += 12; year--; }
        int k = year % 100;
        int j = year / 100;
        int h = (d + (13*(month+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h+6)%7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (isLeapYear(year)) days[1] = 29; else days[1] = 28;
        int firstDay = getFirstDay(month, year);
        System.out.println("Calendar for " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int day = 1; day <= days[month-1]; day++) {
            System.out.printf("%3d ", day);
            if ((day+firstDay) % 7 == 0) System.out.println();
        }
    }
}
