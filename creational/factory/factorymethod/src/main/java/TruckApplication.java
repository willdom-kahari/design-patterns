/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class TruckApplication extends VehicleApplication{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
