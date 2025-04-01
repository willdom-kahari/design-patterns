/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class BikeApplication extends VehicleApplication{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
