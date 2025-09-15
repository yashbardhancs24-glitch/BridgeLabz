public class Problem2 {
    public static void main(String[] args) {

        double mathScore = 94.0;
        double physicsScore = 95.0;
        double chemistryScore = 96.0;

        double totalMarks = mathScore + physicsScore + chemistryScore;
        int totalSubjects = 3;

        double averagePercentage = totalMarks / totalSubjects;

        System.out.println("Sam's average mark in PCM is " + averagePercentage + ".");
    }
}
