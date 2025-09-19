public class Student {
    // Attributes
    String name;
    int rollNumber;
    int marks;

    // Constructor
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display the student's details and grade
    public void displayReport() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student student1 = new Student("Bob Johnson", 25, 85);
        student1.displayReport();
    }
}