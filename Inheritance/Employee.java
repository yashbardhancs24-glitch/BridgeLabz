
class Employee {
    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}
class Manager extends Employee {
    private int teamSize;

    public Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method first
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Language: " + programmingLanguage);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager(101, "Alice", 90000, 10);
        Employee developer = new Developer(202, "Bob", 75000, "Java");

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
    }
}