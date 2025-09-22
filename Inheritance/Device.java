class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = "Off";
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, double temperatureSetting) {
        super(deviceId);
        this.temperatureSetting = temperatureSetting;
        this.status = "On";
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat livingRoomThermo = new Thermostat("LR-01", 22.5);
        livingRoomThermo.displayStatus();
    }
}