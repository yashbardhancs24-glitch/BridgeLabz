import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();
        double percentage = (physics+chemistry+maths)/3;
        String grade, remark;
        if(percentage>=90){ grade="A"; remark="Excellent"; }
        else if(percentage>=75){ grade="B"; remark="Very Good"; }
        else if(percentage>=60){ grade="C"; remark="Good"; }
        else if(percentage>=50){ grade="D"; remark="Average"; }
        else{ grade="F"; remark="Fail"; }
        System.out.println("Average: "+percentage+"\nGrade: "+grade+"\nRemarks: "+remark);
    }
}
