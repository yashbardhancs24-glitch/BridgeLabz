package Interface;

import java.util.function.Predicate;

public class TemperatureAlertDemo {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40.0;
        double currentTemp = 42.5;

        if (alert.test(currentTemp))
            System.out.println("⚠️ Temperature Alert: Too Hot!");
        else
            System.out.println("Temperature Normal.");
    }
}
