class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) { this.name = name; this.age = age; }
}

class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() {
        System.out.println(name + " is a Teacher, teaching " + subject + ".");
    }
}

class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println(name + " is a Student in Grade " + grade + ".");
    }
}

public class SchoolRoleDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 45, "Math");
        Student student = new Student("Emily", 15, 10);
        teacher.displayRole();
        student.displayRole();
    }
}