/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public abstract class VehicleApplication {
    public abstract Vehicle createVehicle();
    public void driveVehicle(){
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
