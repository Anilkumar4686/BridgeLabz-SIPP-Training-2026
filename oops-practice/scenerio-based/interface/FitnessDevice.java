interface Trackable {
    void logActivity(String activity);

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity(String activity) {
        System.out.println("Activity Logged: " + activity);
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated.");
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}

public class Main {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity("Running - 5 km");
        device.generateReport();
        device.sendAlert("Drink Water!");
        device.resetData();
    }
}