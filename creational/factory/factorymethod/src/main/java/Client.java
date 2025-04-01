/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Client {
    public static void main(String[] args) {
        VehicleApplication app = new BikeApplication();
        app.driveVehicle();
        app = new CarApplication();
        app.driveVehicle();
        app = new TruckApplication();
        app.driveVehicle();
    }
}
