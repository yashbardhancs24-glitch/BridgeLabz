import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.printf("ID: %s, Name: %s, Base Salary: %.2f, Final Salary: %.2f%n",
                employeeId, name, baseSalary, calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private double allowance;
    private String department;

    public FullTimeEmployee(String id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.allowance = allowance;
    }

    public double getAllowance() { return allowance; }
    public void setAllowance(double allowance) { this.allowance = allowance; }

    @Override
    public double calculateSalary() { return getBaseSalary() + allowance; }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }
    @Override
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private double hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(String id, String name, double hourlyRate, double hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public double calculateSalary() { return hoursWorked * hourlyRate; }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }
    @Override
    public String getDepartmentDetails() { return department; }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f = new FullTimeEmployee("F001", "Alice", 50000, 5000);
        f.assignDepartment("HR");
        PartTimeEmployee p = new PartTimeEmployee("P001", "Bob", 500, 80);
        p.assignDepartment("IT");
        employees.add(f);
        employees.add(p);
        for (Employee e : employees) {
            e.displayDetails();
            if (e instanceof Department) System.out.println("Department: " + ((Department)e).getDepartmentDetails());
        }
    }
}
