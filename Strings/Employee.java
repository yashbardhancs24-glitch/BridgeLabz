public class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor to initialize attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Salary: $" + this.salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Smith", 101, 75000.0);
        emp1.displayDetails();
    }
}