import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}
class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class VehicleTracker {
    public void checkMaintenance(int currentMileage, LocalDate lastServiceDate) 
            throws ServiceOverdueException, InvalidMileageException {
        
        if (currentMileage < 0) {
            throw new InvalidMileageException("Invalid Mileage: Mileage cannot be negative.");
        }
        
        LocalDate today = LocalDate.now();
        LocalDate nextServiceDue = lastServiceDate.plusMonths(6);
        
        if (today.isAfter(nextServiceDue)) {
            throw new ServiceOverdueException("Service Overdue: Next service was due on " + nextServiceDue);
        }
        
        System.out.println("Maintenance check passed. Vehicle is up to date.");
    }
}

public class VehicleMaintenance {
    public static void main(String[] args) {
        VehicleTracker tracker = new VehicleTracker();
        int mileage = 50000;
        LocalDate serviceDate = LocalDate.of(2025, 3, 10);

        try {
            tracker.checkMaintenance(mileage, serviceDate);
        } catch (ServiceOverdueException e) {
            System.err.println("Maintenance Alert! " + e.getMessage());
            System.out.println("Please schedule a service appointment immediately.");
        } catch (InvalidMileageException e) {
            System.err.println("Data Entry Error! " + e.getMessage());
        }
    }
}