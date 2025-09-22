import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rate) { this.rentalRate = rate; }
    public abstract double calculateRentalCost(int days);
    public void showDetails() { System.out.printf("%s [%s] - Rate/day: %.2f%n", vehicleNumber, type, rentalRate); }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return 500; }
    @Override public String getInsuranceDetails() { return "Car insurance fixed: 500"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    @Override public double calculateInsurance() { return 150; }
    @Override public String getInsuranceDetails() { return "Bike insurance fixed: 150"; }
}

class Truck extends Vehicle {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(
                new Car("KA01AB1234", 2000),
                new Bike("KA01XY9876", 400),
                new Truck("KA01TR0001", 5000)
        );
        int days = 3;
        for (Vehicle v : fleet) {
            v.showDetails();
            double rent = v.calculateRentalCost(days);
            System.out.printf("Rental for %d days: %.2f%n", days, rent);
            if (v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.printf("Insurance: %.2f (%s)%n", ins.calculateInsurance(), ins.getInsuranceDetails());
            } else System.out.println("No insurance available via system.");
            System.out.println();
        }
    }
}
