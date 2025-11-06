class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_C = -273.15;
    private static final double ABSOLUTE_ZERO_F = -459.67;

    public double convert(double value, char unit) throws InvalidTemperatureException {
        unit = Character.toUpperCase(unit);
        
        if (unit == 'C' && value < ABSOLUTE_ZERO_C) {
            throw new InvalidTemperatureException(
                "Temperature below absolute zero (" + ABSOLUTE_ZERO_C + "°C) is not possible."
            );
        } else if (unit == 'F' && value < ABSOLUTE_ZERO_F) {
            throw new InvalidTemperatureException(
                "Temperature below absolute zero (" + ABSOLUTE_ZERO_F + "°F) is not possible."
            );
        }

        if (unit == 'C') {
            return (value * 9 / 5) + 32;
        } else if (unit == 'F') {
            return (value - 32) * 5 / 9;
        } else {
            throw new IllegalArgumentException("Invalid unit: Use 'C' or 'F'.");
        }
    }
}

public class WeatherMonitoring {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double invalidTemp = -300.0;
        char unit = 'C';

        try {
            double converted = converter.convert(invalidTemp, unit);
            System.out.printf("%.2f%c is %.2f%c%n", invalidTemp, unit, converted, (unit == 'C' ? 'F' : 'C'));
        } catch (InvalidTemperatureException e) {
            System.err.println("Error: Temperature below absolute zero is not possible!");
        }
    }
}