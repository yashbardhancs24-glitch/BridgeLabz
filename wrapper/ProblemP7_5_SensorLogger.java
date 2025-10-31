import java.util.ArrayList;
import java.util.List;

public class ProblemP7_5_SensorLogger {
    
    private List<Double> temperatureReadings = new ArrayList<>();

    public void logReading(double reading) {
        System.out.println("Logged (primitive): " + reading);
        temperatureReadings.add(reading);
    }
    
    public void logReading(Double reading) {
        if (reading == null) {
            System.out.println("Logged (wrapper): null reading ignored");
        } else {
            System.out.println("Logged (wrapper): " + reading);
            temperatureReadings.add(reading);
        }
    }
    
    public void printReadings() {
        System.out.println("\n--- All Readings ---");
        for (Double reading : temperatureReadings) {
            if (reading != null) {
                double temp = reading;
                System.out.println("Reading: " + temp);
            }
        }
    }

    public static void main(String[] args) {
        ProblemP7_5_SensorLogger logger = new ProblemP7_5_SensorLogger();
        
        logger.logReading(98.6);
        logger.logReading(Double.valueOf(100.2));
        logger.logReading(null);
        logger.logReading(99.1);
        
        logger.printReadings();
    }
}